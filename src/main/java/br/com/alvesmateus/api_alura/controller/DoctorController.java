package br.com.alvesmateus.api_alura.controller;

import br.com.alvesmateus.api_alura.doctor.Doctor;
import br.com.alvesmateus.api_alura.doctor.DoctorRepository;
import br.com.alvesmateus.api_alura.doctor.ListingDoctorData;
import br.com.alvesmateus.api_alura.doctor.RegisterDoctorData;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid RegisterDoctorData data) {
        repository.save(new Doctor(data));
    }

    @GetMapping
    public Page<ListingDoctorData> list(@PageableDefault(size = 10, sort = {"nome"}) Pageable pagination) {
        return repository.findAll(pagination).map(ListingDoctorData::new);
    }

}
