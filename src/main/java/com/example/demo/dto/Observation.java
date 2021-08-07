package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//DTO Service <-> Controller <-> DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Observation {

    String date;
    Double value;

}
