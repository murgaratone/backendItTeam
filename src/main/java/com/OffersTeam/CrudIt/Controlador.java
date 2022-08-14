package com.OffersTeam.CrudIt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:*")
@RestController
@RequestMapping({"/offers"})
public class Controlador {
    @Autowired
    OffersService service;
    @GetMapping("")
    public List<Offers>listar(){
        return service.listar();
    }

}
