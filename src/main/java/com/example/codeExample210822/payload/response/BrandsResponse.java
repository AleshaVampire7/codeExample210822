package com.example.codeExample210822.payload.response;

import lombok.Data;

import java.util.List;


@Data
public class BrandsResponse {
  List<IdNameResponse> brands_arr;
}
