package com.example.RiteHite.Model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "crud")
public class RiteHite_Crud {

    @Id
    private Long id;

    private String name;
    private int age;
    private String address;
    private String productPurchased;


    public RiteHite_Crud(Long id, String name, int age, String address, String productPurchased) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.productPurchased = productPurchased;
    }
}