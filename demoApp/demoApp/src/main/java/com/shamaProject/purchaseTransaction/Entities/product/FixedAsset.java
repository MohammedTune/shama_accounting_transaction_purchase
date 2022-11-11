package com.shamaProject.purchaseTransaction.product;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class FixedAsset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}
