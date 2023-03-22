package com.example.Hospital.modules;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "consultorios")
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idconsultorio")
    private Integer id;
    private Integer numero;
    private String piso;
}
