package com.reto2.interfaces;

import com.reto2.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GadgetInterface extends MongoRepository<Gadget, Integer> {
    //public List<Gadget> findByPrice(double price);
    public List<Gadget> findByPriceLessThanEqual(double price);

    public List <Gadget> findByDescriptionContainingIgnoreCase(String description);
}
