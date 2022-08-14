package com.OffersTeam.CrudIt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersServiceImp implements OffersService{
    @Autowired
    private OfferRepository repository;

    @Override
    public List<Offers> listar() {
        return repository.findAll();
    }

    @Override
    public Offers listarId(Integer p) {
        return repository.findOne(p);
    }

    @Override
    public Offers add(Offers p) {
        return repository.save(p);
    }

    @Override
    public Offers edit(Offers p) {
        return repository.save(p);
    }

    @Override
    public Offers delete(Integer id) {
        Offers offer=repository.findOne(id);
        return repository.delete(offer);

    }
}
