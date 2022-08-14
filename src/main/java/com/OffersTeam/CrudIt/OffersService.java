package com.OffersTeam.CrudIt;

import java.util.List;

public interface OffersService {
    List<Offers>listar();
    Offers listarId(Integer p);
    Offers add(Offers p);
    Offers edit(Offers p);
    Offers delete(Integer id);

}
