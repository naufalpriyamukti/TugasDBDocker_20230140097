package com.example.praktikum7kedua.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users_20230140097")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nim;
}