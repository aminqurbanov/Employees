package com.example.simpleemployeesystem.dao.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String firstName;
     String lastName;
     String email;
}
