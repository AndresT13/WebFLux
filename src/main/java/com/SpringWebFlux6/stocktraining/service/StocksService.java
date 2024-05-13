package com.SpringWebFlux6.stocktraining.service;


import com.SpringWebFlux6.stocktraining.dto.StockRequest;
import com.SpringWebFlux6.stocktraining.dto.StockResponse;
import com.SpringWebFlux6.stocktraining.model.Stock;
import com.SpringWebFlux6.stocktraining.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Optional;


@Service
@AllArgsConstructor
public class StocksService implements IStockService {

    @Autowired
    private StockRepository stockRepository;


    public Mono<StockResponse> getOneStock(String id) {
        return stockRepository.findById(id)
                //.map(stock -> StockResponse.fromModel(stock));

                //Referencia del método
                .map(StockResponse::fromModel);
    }

    @Override
    public Flux<StockResponse> getAllStocks() {
        return stockRepository.findAll()
                .map(StockResponse::fromModel);
    }

    @Override
    public Mono<StockResponse> createStock(StockRequest stockRequest) {
        return stockRepository.save(stockRequest.toModel())
                .map(StockResponse::fromModel);

    }


}
