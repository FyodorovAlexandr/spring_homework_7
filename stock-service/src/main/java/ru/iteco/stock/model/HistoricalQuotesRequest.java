package ru.iteco.stock.model;

import lombok.Data;

import java.util.List;

@Data
public class HistoricalQuotesRequest {

    private List<String> tickets;
    private String date;

}
