package com.OffersTeam.CrudIt;


import org.springframework.data.repository.Repository;

import java.util.List;

public interface OfferRepository extends Repository <Offers, Integer>{
    List<Offers>findAll();
    Offers findOne(int id);
    Offers save(Offers p);
    Offers delete(Offers p);
}
