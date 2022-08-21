package com.example.codeExample210822.payload.response;

import lombok.Data;

@Data
public class IdNameResponse {

  Integer id;
  String name;

  public IdNameResponse(Integer id, String name) {
    this.id = id;
    this.name = name;
  }


  public IdNameResponse() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSyste
  }


}
