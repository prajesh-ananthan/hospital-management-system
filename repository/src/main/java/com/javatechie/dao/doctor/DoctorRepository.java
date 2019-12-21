package com.javatechie.dao.doctor;

import com.javatechie.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by prajesh.ananthan on 14/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
