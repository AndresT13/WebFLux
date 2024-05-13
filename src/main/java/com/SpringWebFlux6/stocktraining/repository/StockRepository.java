package com.SpringWebFlux6.stocktraining.repository;

import com.SpringWebFlux6.stocktraining.model.Stock;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends ReactiveMongoRepository<Stock,String> {
}
