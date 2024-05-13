package com.SpringWebFlux6.stocktraining.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Stock {

    private String id;
    private String name;
    private BigDecimal price;
    private String currency;

}
