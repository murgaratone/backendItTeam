package com.oscar.crudIt.controller;

import com.oscar.crudIt.entity.Offer;
import com.oscar.crudIt.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping({"/offers"})
public class Controlador {
    @Autowired
    OfferService service;
    @GetMapping("")
    public List<Offer>listar(){
        return service.listar();
    }
    @GetMapping("/{id}")
    public Optional <Offer> oferta(@PathVariable("id") int offerId){return service.listarId(offerId);}
    @PostMapping("")
    public Offer crear(@RequestBody Offer offer){return service.add(offer);}
    @PutMapping("")
    public Offer modificar(@RequestBody Offer offerToModify){return service.edit(offerToModify);}
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int offerId){service.delete(offerId);}
}
