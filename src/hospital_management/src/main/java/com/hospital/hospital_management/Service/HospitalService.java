package com.hospital.hospital_management.Service;
import com.hospital.hospital_management.Models.Hospital;

import java.util.*;
public interface HospitalService {
    Hospital saveHospital(Hospital hospital);
    List<Hospital>getAllHospital();
    Hospital getpatientById(int patient_id);

    Hospital updatepatient(Hospital hospital, int patient_id);

    void deletepatient(int patient_id);

}
