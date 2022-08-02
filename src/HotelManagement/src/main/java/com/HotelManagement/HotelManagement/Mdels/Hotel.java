package com.HotelManagement.HotelManagement.Mdels;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "HotelManagement")
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private int room_number;
    @Column(nullable = false)
    private String address;
}
