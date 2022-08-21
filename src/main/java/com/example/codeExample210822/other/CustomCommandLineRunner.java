package com.example.codeExample210822.other;

import com.example.codeExample210822.parser.Parser;
import com.example.codeExample210822.repositories.Ca_Car_Brand_Repository;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

  @Autowired
  Ca_Car_Brand_Repository ca_car_brand_repository;

  @Autowired
  WebDriver webDriver;

  @Autowired
  Parser parser;

  Logger logger = Logger.getLogger(this.getClass().getSimpleName());

  @Override
  public void run(String... args) throws Exception {

    logger.info("test_info");

    //Ca_Car_Brand_Repository query tests
    ca_car_brand_repository.pop_top_brands();
    ca_car_brand_repository.get_all_mototech();
    ca_car_brand_repository.get_pop_mototech();
    ca_car_brand_repository.get_all_spare_parts_for_commercial();
    ca_car_brand_repository.get_pop_spare_parts_for_commercial();
    ca_car_brand_repository.get_all_trucks();
    ca_car_brand_repository.get_pop_trucks();
    ca_car_brand_repository.get_all_buses();
    ca_car_brand_repository.get_pop_buses();
    ca_car_brand_repository.get_all_sapecial_equipment();
    ca_car_brand_repository.findByNameCars("Toyota");

    //Update info
    parser.updateinfo(webDriver);

  }
}
