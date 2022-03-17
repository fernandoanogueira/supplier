package com.nogueira.supplier.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nogueira.supplier.model.Supplier;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, Long> {

}
