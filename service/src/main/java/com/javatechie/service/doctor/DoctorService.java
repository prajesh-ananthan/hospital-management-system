package com.javatechie.service.doctor;

import com.javatechie.model.doctor.Doctor;

import java.util.List;

/**
 * Created by prajesh.ananthan on 21/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

public interface DoctorService {
    List<Doctor> getDoctors();
}
