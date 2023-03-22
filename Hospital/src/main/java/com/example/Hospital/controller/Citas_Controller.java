package com.example.Hospital.controller;

import com.example.Hospital.modules.Citas;
import com.example.Hospital.modules.Consultorio;
import com.example.Hospital.modules.Doctor;
import com.example.Hospital.repo.CitasRepository;
import com.example.Hospital.repo.ConsultorioRepository;
import com.example.Hospital.repo.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class Citas_Controller {

    @Autowired
    private CitasRepository citasRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private ConsultorioRepository consulRepository;


    @GetMapping("/")
    public String index(Model model, @PageableDefault(size=3) Pageable pageable){

      Page<Citas> citas = citasRepository.findAll(pageable);
        model.addAttribute("citas", citas);
        return "index";
    }

    @GetMapping("/nueva") // va a mapear el template nuevo
    public ModelAndView nueva (Model model){
        List<Doctor> doctores = doctorRepository.findAll(Sort.by("nombre"));
        List<Consultorio> consultorios = consulRepository.findAll(Sort.by("piso"));
        return new ModelAndView("crear_citas")
                .addObject("doctores",doctores)
                .addObject("consultorio",consultorios)
                .addObject("cita",new Citas());
    }



    @PostMapping("/nueva")
    public String crear(Citas cita, RedirectAttributes ra){

        citasRepository.save(cita);
        ra.addFlashAttribute("msgExito","Nueva Cita Agregada");
        return "redirect:/";
    }



}
