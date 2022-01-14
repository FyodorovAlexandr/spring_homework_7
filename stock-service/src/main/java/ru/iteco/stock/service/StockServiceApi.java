package ru.iteco.stock.service;

import ru.iteco.stock.model.HistoricalQuotesRequest;
import ru.iteco.stock.model.HistoricalQuotesResponse;
import ru.iteco.stock.model.StockQuotes;

import java.util.List;

public interface StockServiceApi {

    StockQuotes getStockQuotesByTicket(List<String> tickets);

    HistoricalQuotesResponse getHistoricalQuotes(HistoricalQuotesRequest request);

}