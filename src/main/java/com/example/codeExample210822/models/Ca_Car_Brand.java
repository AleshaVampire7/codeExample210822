package com.example.codeExample210822.models;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Proxy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ca_car_brand")
@Proxy(lazy = false)
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class Ca_Car_Brand {

  //fields
  private Integer ca_car_brand;
  private String name;
  private Boolean is_deleted;
  private Integer ca_car_type;

  public Ca_Car_Brand() {

  }

  public Ca_Car_Brand(String brand_name, boolean is_deleted, int type) {
    this.name = brand_name;
    this.is_deleted = is_deleted;
    this.ca_car_type = type;
  }

  //fields getter and setter methods
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ca_car_brand", unique = true, nullable = false)
  public Integer getCa_car_brand() {
    return this.ca_car_brand;
  }

  public void setCa_car_brand(Integer ca_car_brand) {
    this.ca_car_brand = ca_car_brand;
  }

  @Type(type = "text")
  @Column(name = "name", nullable = false)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "is_deleted", nullable = false)
  public Boolean getIs_deleted() {
    return this.is_deleted;
  }

  public void setIs_deleted(Boolean is_deleted) {
    this.is_deleted = is_deleted;
  }

  @Column(name = "ca_car_type", nullable = false)
  public Integer getCa_car_type() {
    return this.ca_car_type;
  }

  public void setCa_car_type(Integer ca_car_type) {
    this.ca_car_type = ca_car_type;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.getCa_car_brand());
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Ca_Car_Brand other = (Ca_Car_Brand) obj;
    if (!Objects.equals(this.getCa_car_brand(), other.getCa_car_brand())) {
      return false;
    }
    return true;
  }

} 
