package com.example.Hospital.modules;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "doctores")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddoctor")
    private Integer id;
    private String nombre;
    private String ape_p;
    private String ape_m;
    private String especialidad;


/*
    @ManyToMany (fetch = FetchType.LAZY)// se detacla un muchos a muchos
    //se indica la relaccion de la tabla que se tendra
    @JoinTable (name="citas",
            joinColumns= @JoinColumn(name="iddoctor"),
            inverseJoinColumns = @JoinColumn(name="idconsultorio"))
    //se declara la lista
    List<Citas> citas;
*/

}
