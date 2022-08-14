package com.oscar.crudIt.service;

import com.oscar.crudIt.entity.Offer;

import java.util.List;
import java.util.Optional;

public interface OfferService {
    List<Offer>listar();
    Optional listarId(Integer p);
    Offer add(Offer p);
    Offer edit(Offer p);
    void delete(Integer id);

}
