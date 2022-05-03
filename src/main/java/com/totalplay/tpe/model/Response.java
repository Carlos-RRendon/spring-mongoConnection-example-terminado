package com.totalplay.tpe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;


@Data @NoArgsConstructor @AllArgsConstructor
public class Response{
    Object response;
    String message;
    String status;


}
