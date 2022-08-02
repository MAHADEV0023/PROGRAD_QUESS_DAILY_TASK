package com.hospital.hospital_management.Service;
import com.hospital.hospital_management.Models.Hospital;
import com.hospital.hospital_management.Repository.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRepo hospitalRepo;

    public HospitalServiceImpl(HospitalRepo hospitalRepo) {
        this.hospitalRepo = hospitalRepo;
    }

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepo.save(hospital);
    }

    @Override
    public List<Hospital> getAllHospital() {
        return hospitalRepo.findAll();
    }

    @Override
    public Hospital getpatientById(int id) {
        return hospitalRepo.findById(id).orElseThrow();
    }



    @Override
    public Hospital updatepatient(Hospital hospital, int patient_id) {
        Hospital existingHospital=hospitalRepo.findById(patient_id).orElseThrow();
        existingHospital.setPatientName(hospital.getPatientName());
        existingHospital.setGender(hospital.getGender());
        existingHospital.setAge(hospital.getAge());
        existingHospital.setPhone_number(hospital.getPhone_number());
        existingHospital.setAddress(hospital.getAddress());
        hospitalRepo.save(existingHospital);
        return existingHospital;

    }
    @Override
    public void deletepatient(int patient_id) {
        hospitalRepo.findById(patient_id).orElseThrow();
        hospitalRepo.deleteById(patient_id);
    }
}
