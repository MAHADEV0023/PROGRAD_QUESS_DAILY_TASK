package com.HotelManagement.HotelManagement.Service;
import com.HotelManagement.HotelManagement.Mdels.Hotel;
import com.HotelManagement.HotelManagement.Repository.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepo hotelRepo;
    public HotelServiceImpl(HotelRepo hotelRepo){
        this.hotelRepo=hotelRepo;
    }
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelById(int id) {
        return hotelRepo.findById(id).orElseThrow();
    }

    @Override
    public Hotel updateHotel(Hotel hotelt, int id) {
        Hotel existingHotel=hotelRepo.findById(id).orElseThrow();
        existingHotel.setFirstName(hotelt.getFirstName());
        existingHotel.setLastName(hotelt.getLastName());
        existingHotel.setGender(hotelt.getGender());
        existingHotel.setRoom_number(hotelt.getRoom_number());
        existingHotel.setAge(hotelt.getAge());
        existingHotel.setAddress(hotelt.getAddress());
        hotelRepo.save(existingHotel);
        return existingHotel;


    }

    @Override
    public void deleteHotel(int id) {
hotelRepo.findById(id).orElseThrow();
hotelRepo.deleteById(id);
    }
}
