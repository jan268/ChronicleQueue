package com.chronicle.B.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Human implements Serializable {

    Long id;
    String name;
    String lastName;
    String phoneNumber;
    String zipCode;
    String city;
}
