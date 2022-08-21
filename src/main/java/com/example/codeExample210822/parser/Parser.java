package com.example.codeExample210822.parser;

import com.example.codeExample210822.models.Ca_Car_Brand;
import com.example.codeExample210822.services.Ca_Car_Brand_Service;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Parser {

  @Autowired
  private Ca_Car_Brand_Service ca_car_brand_service;

  @Bean
  public String updateinfo(WebDriver driver) {

    try {
      driver.get("https://www.izmostock.com/car-stock-photos-by-brand");

      List<WebElement> elements = driver.findElements(By.id("by_brand"));

      List<String> brands = new ArrayList<>();
      for (WebElement element :
        elements) {
        ca_car_brand_service.save_brand(new Ca_Car_Brand(element.getText(), false, 1));
      }
    } catch (Exception e) {
      return e.getMessage();
    }
    driver.quit();
    return null;
  }

}
