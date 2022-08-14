package com.OffersTeam.CrudIt;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OffersServiceImp implements OffersService{
    @Autowired
    private OfferRepository repository;

    @Override
    public List<Offers> listar() {
        return (List<Offers>) repository.findAll();
    }

    @Override
    public Optional<Offers> listarId(Integer p) {
        return repository.findById(p);
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
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
