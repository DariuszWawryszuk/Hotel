package com.hotels.hotelsmanagement.repository;

import com.hotels.hotelsmanagement.domain.Hotel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository
public class HotelRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createHotel(String name, String street, String possesionNo, String zipCode, String city){
        Hotel hotel = new Hotel(name, street, possesionNo, zipCode, city);
        em.persist(hotel);
    }

    public Collection<Hotel> getHotels(){
        return em.createQuery("from Hotel where status = '" + Hotel.HOTEL_STATUS_ACTIVE + "'", Hotel.class).getResultList();
    }

    public Hotel getHotel(int id){
        return em.find(Hotel.class, id);
    }

    public Hotel getHotel(String name){
        List<Hotel> hotels =
                em.createQuery("from Hotel h where h.name =:name and status = '" + Hotel.HOTEL_STATUS_ACTIVE + "'", Hotel.class)
                .setParameter("name", name).getResultList();

        if(hotels.isEmpty())
            return null;
        else
            return hotels.get(0);
    }

    @Transactional
    public void updateHotel(Hotel hotel){
        if(hotel != null)
            em.persist(hotel);
    }

    @Transactional
    public void removeHotel(int id){
        Hotel hotel = em.find(Hotel.class, id);

        if(hotel != null){
            hotel.setStatus(Hotel.HOTEL_STATUS_REMOVED);
            em.persist(hotel);
        }
    }
}
