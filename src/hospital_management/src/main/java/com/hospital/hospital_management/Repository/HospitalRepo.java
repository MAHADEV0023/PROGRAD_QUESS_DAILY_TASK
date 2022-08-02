package com.hospital.hospital_management.Repository;
import com.hospital.hospital_management.Models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
public interface HospitalRepo extends JpaRepository<Hospital,Integer> {
}
