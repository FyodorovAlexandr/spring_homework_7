package ru.iteco.stock.model;

import lombok.Data;

import java.util.List;

@Data
public class HistoricalQuotesResponse {

    private List<HistoricalInfo> data;

}
