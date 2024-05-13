package com.SpringWebFlux6.stocktraining.service;

import com.SpringWebFlux6.stocktraining.dto.StockRequest;
import com.SpringWebFlux6.stocktraining.dto.StockResponse;
import com.SpringWebFlux6.stocktraining.model.Stock;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface IStockService {

    public Mono<StockResponse> getOneStock(String id);

    public Flux<StockResponse> getAllStocks();

    public Mono<StockResponse> createStock(StockRequest stockRequest);
}
