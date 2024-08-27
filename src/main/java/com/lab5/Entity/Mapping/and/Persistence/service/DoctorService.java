package com.lab5.Entity.Mapping.and.Persistence.service;

import com.lab5.Entity.Mapping.and.Persistence.model.DoctorModel;
import com.lab5.Entity.Mapping.and.Persistence.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Transactional
    public DoctorModel saveDoctor(DoctorModel doctor) {
        return doctorRepository.save(doctor);
    }

    @Transactional(readOnly = true)
    public DoctorModel getDoctor(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<DoctorModel> getAllDoctors() {
        return doctorRepository.findAll();
    }
    public List<DoctorModel> getDoctorBySpeciality(String speciality) {
        return doctorRepository.findDoctorsBySpeciality(speciality);
    }
    @Transactional
    public DoctorModel updateDoctor(DoctorModel doctor) {
        return doctorRepository.save(doctor);
    }
}
