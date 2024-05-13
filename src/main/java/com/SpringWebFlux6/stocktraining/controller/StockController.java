package com.SpringWebFlux6.stocktraining.controller;

import com.SpringWebFlux6.stocktraining.dto.StockRequest;
import com.SpringWebFlux6.stocktraining.dto.StockResponse;
import com.SpringWebFlux6.stocktraining.model.Stock;
import com.SpringWebFlux6.stocktraining.service.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @Autowired
    private StocksService stockService;

    @GetMapping("/{id}")
    public Mono<StockResponse> getOneStock(@PathVariable String id) {
        // Mono.just(Stock.builder()
        //                    .name("stock-d" + id)
        //                    .build());
        return stockService.getOneStock(id);
    }

    @GetMapping
    public Flux<StockResponse> getAllStock() {

        //  Flux.range(1,5)
        //                .map(count -> Stock.builder()
        //                        .name("stock-d"+ count)
        //                        .build());

        return stockService.getAllStocks();
    }

    @PostMapping
    public Mono<StockResponse> createStock(@PathVariable StockRequest stockRequest) {
        return stockService.createStock(stockRequest);
    }

}
