package com.OffersTeam.CrudIt;

import java.util.List;
import java.util.Optional;

public interface OffersService {
    List<Offers>listar();
    Optional listarId(Integer p);
    Offers add(Offers p);
    Offers edit(Offers p);
    void delete(Integer id);

}
