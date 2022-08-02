package com.hospital.hospital_management.Models;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="patient")
public class Hospital {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patient_id;
    @Column(nullable = false)
    private String patientName;
    @Column(nullable = false)
    private String gender;
    @Column (nullable = false)
    private int age;
    @Column(nullable = false)
    private long phone_number;
    @Column (nullable = false)
    private String address;


}
