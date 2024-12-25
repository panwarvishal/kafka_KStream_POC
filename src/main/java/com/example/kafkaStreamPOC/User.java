package com.example.kafkaStreamPOC;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User implements Serializable {
    Integer id;
    String name;
    String address;
    Integer salary;
}