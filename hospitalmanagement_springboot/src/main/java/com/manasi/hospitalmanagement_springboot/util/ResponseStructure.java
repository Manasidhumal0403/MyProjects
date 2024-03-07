package com.manasi.hospitalmanagement_springboot.util;

import com.manasi.hospitalmanagement_springboot.dto.Hospital;
import com.manasi.hospitalmanagement_springboot.dto.MedOrder;

import lombok.Data;
@Data
public class ResponseStructure <T> {
  private String message;
  private int statusCode;
  private T data;


  
  
}
