package com.javatechie.controller;

import com.javatechie.model.doctor.Doctor;
import com.javatechie.service.doctor.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by prajesh.ananthan on 21/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping("/list")
    public List<Doctor> getDoctors() {
        return doctorService.getDoctors();
    }
}
