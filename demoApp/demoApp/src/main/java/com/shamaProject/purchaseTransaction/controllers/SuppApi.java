package com.shamaProject.purchaseTransaction;

import com.shamaProject.purchaseTransaction.Entities.suppliers.Suppliers;
import com.shamaProject.purchaseTransaction.servises.SuppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Suppliers")
public class ApiController {
    private SuppService supservise;
    private long suppliers;
     public ApiController(SuppService supservise) {
        this.supservise = supservise;
    }

                     @PostMapping("/add")

    public ResponseEntity<Suppliers> addsuppliers(@RequestBody Suppliers supplier){
        Suppliers newsuppliers=supservise.addsupplies(supplier);
        return new ResponseEntity<>(newsuppliers,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Suppliers> updatesuppliers(@RequestBody Suppliers supplier){
        Suppliers updatesuppliers=supservise.updatesuppliers(supplier);
        return new ResponseEntity<>(updatesuppliers,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletesuppliers(@PathVariable("id") long id){
       supservise.deletesuppliers(suppliers);
        return new ResponseEntity<>(deletesuppliers(suppliers),HttpStatus.CREATED);
    }
     }


