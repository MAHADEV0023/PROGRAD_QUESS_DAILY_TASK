package com.HotelManagement.HotelManagement.Service;
import com.HotelManagement.HotelManagement.Mdels.Hotel;
import java.util.*;
public interface HotelService {
    Hotel saveHotel(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel getHotelById(int id);
    Hotel updateHotel(Hotel hotelt,int id);
    void deleteHotel(int id);
}
