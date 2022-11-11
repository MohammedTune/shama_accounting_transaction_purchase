package com.shamaProject.purchaseTransaction.Entities.purchase;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name="NewOrder")
public class NewOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

   }
