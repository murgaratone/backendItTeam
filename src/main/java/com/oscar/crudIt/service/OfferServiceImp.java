package com.oscar.crudIt.service;

import java.util.List;
import java.util.Optional;

import com.oscar.crudIt.entity.OfferRepository;
import com.oscar.crudIt.entity.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImp implements OfferService {
    @Autowired
    private OfferRepository repository;

    @Override
    public List<Offer> listar() {
        return (List<Offer>) repository.findAll();
    }

    @Override
    public Optional<Offer> listarId(Integer p) {
        return repository.findById(p);
    }

    @Override
    public Offer add(Offer p) {
        return repository.save(p);
    }

    @Override
    public Offer edit(Offer p) {
        return repository.save(p);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
