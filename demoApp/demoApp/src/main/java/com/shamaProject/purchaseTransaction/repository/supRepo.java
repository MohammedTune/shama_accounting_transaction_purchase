package com.shamaProject.purchaseTransaction.repository;

import com.shamaProject.purchaseTransaction.suppliers.suppliers;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;
public interface supRepo extends JpaRepository<suppliers, Long> {
    void deletesuppliersById(long id);

    Optional<suppliers> findsupplierById(long id);

       Optional<suppliers> findById(Long aLong);

    @Override
    List<suppliers> findAll();
}
