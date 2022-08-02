package com.hospital.hospital_management.Controller;
import com.hospital.hospital_management.Models.Hospital;
import com.hospital.hospital_management.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;

    }
    @PostMapping
    public ResponseEntity<Hospital> saveHotel(@RequestBody  Hospital hospital)
    {
        return new ResponseEntity< Hospital>(hospitalService.saveHospital(hospital), HttpStatus.CREATED);
    }
    @GetMapping
    public List<Hospital> getAllHotel(){
        return hospitalService.getAllHospital();
    }
    @GetMapping("{id}")
    public ResponseEntity<Hospital> getpatientById(@PathVariable("patient_id")int patient_id)
    {
        return new ResponseEntity<Hospital>(hospitalService. getpatientById(patient_id),HttpStatus.OK);
    }
    @PutMapping("{patient_id}")
    public ResponseEntity<Hospital> updatepatient(@PathVariable("patient_id")int patient_id,@RequestBody Hospital hospital)
    {
        return new ResponseEntity<Hospital>(hospitalService.updatepatient(hospital,patient_id), HttpStatus.OK);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String>deletepatient(@PathVariable("patient_idd")int patient_id)
    {
        hospitalService.deletepatient(patient_id);
        return new ResponseEntity<String>("patient detail deleted successfully",HttpStatus.OK);
    }
}
