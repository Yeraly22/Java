package com.eraly.entity;


import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Car {
   @NonNull
    private int id;

    @NonNull
    private String model;
}
