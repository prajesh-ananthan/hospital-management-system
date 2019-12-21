package com.javatechie.service.doctor.impl;

import com.javatechie.dao.doctor.DoctorRepository;
import com.javatechie.model.doctor.Doctor;
import com.javatechie.service.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by prajesh.ananthan on 21/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @PostConstruct
    public void initDoctor() {
        doctorRepository.saveAll(Stream.of(
                new Doctor(101, "John", "Cardiac"),
                new Doctor(102, "Peter", "Eye"))
                .collect(Collectors.toList()));
    }

    @Override
    public List<Doctor> getDoctors() {
        return doctorRepository.findAll();
    }
}
