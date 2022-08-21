package com.example.codeExample210822.services;

import com.example.codeExample210822.models.Ca_Car_Brand;
import com.example.codeExample210822.repositories.Ca_Car_Brand_Repository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ca_Car_Brand_Service {

  @Autowired
  private Ca_Car_Brand_Repository ca_car_brand_repository;

  public Ca_Car_Brand save_brand(Ca_Car_Brand ca_car_brand) throws JSONException {


    if (ca_car_brand_repository.findByNameCars(ca_car_brand.getName()) == null) {
      ca_car_brand_repository.save(ca_car_brand);
    }

    return ca_car_brand_repository.findByNameCars(ca_car_brand.getName());

  }

  public List<Ca_Car_Brand> get_all() throws JSONException {
    return ca_car_brand_repository.findAll();
  }

}
