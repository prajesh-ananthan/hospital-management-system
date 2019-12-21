package com.javatechie.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by prajesh.ananthan on 13/12/2019.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {

    @Id
    private int id;
    private String name;
    private String specialist;
}
