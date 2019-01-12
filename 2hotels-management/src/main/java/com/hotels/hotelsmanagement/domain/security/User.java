package com.hotels.hotelsmanagement.domain.security;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String password;
    private boolean enabled;

    @OneToMany(mappedBy = "user")
    private List<Role> roles;

    public User(){
        this.userName = "test";
        this.password = "test";
        this.enabled = true;
        this.roles = new ArrayList<>();
    }

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.enabled = true;
        this.roles = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void addRole(Role role){
        this.roles.add(role);
    }
}
