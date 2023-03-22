package com.example.Hospital.repo;

import com.example.Hospital.modules.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasRepository extends JpaRepository <Citas,Integer> {
}
