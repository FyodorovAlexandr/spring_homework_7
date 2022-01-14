package ru.iteco.stock.model;

import lombok.Data;

import java.util.List;

@Data
public class StockQuotes {

    private List<Info> data;

}
