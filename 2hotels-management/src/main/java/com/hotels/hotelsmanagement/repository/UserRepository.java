package com.hotels.hotelsmanagement.repository;

import com.hotels.hotelsmanagement.domain.security.Role;
import com.hotels.hotelsmanagement.domain.security.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createUser(String userName, String password){
        em.persist(new User(userName, password));
    }

    @Transactional
    public void addRoleToUser(String userName, String roleName){
        User user = em.createQuery("from User u where u.userName =:userName", User.class)
                .setParameter("userName", userName).getSingleResult();

        if(user != null && roleName != null) {
            Role role = new Role(roleName);
            user.addRole(role);
            role.setUser(user);
            em.persist(role);
            em.persist(user);
        }
    }

    public List<User> getUsers(){
        return em.createQuery("from User", User.class).getResultList();
    }
}
