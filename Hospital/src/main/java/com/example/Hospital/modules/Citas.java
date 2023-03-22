package com.example.Hospital.modules;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "citas")
public class Citas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcita")
    private Integer id;
    private Integer idconsultorio;
    private Integer iddoctor;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDateTime horario_consul;
    private String nombre_paciente;




}
