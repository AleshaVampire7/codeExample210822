package com.example.codeExample210822.controllers;

import com.example.codeExample210822.models.Ca_Car_Brand;
import com.example.codeExample210822.payload.response.BrandsResponse;
import com.example.codeExample210822.payload.response.IdNameResponse;
import com.example.codeExample210822.services.Ca_Car_Brand_Service;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class Ca_Car_Brand_Controller {

  @Autowired
  private Ca_Car_Brand_Service ca_car_brand_service;

  @GetMapping("/get_test")
  public ResponseEntity<?> get_special_equipment_seller() throws JSONException {

    BrandsResponse res = new BrandsResponse();

    List<IdNameResponse> brandsAdd = new ArrayList<>();
    List<Ca_Car_Brand> brands = ca_car_brand_service.get_all();

    for (Ca_Car_Brand brand : brands) {
      brandsAdd.add(new IdNameResponse(brand.getCa_car_brand(), brand.getName()));
    }

    res.setBrands_arr(brandsAdd);

    return new ResponseEntity<>(res, HttpStatus.OK);

  }

}
