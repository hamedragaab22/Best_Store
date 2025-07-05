package com.crudoperation.best_store.services;

import com.crudoperation.best_store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product,Integer> {
}
