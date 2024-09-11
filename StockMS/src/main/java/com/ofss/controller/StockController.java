package com.ofss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.model.Stock;
import com.ofss.service.StockService;

@RestController
public class StockController {

	@Autowired
	StockService stockService;
	
	public StockController() {
		
		
	}
	
	@RequestMapping(value="/stocks",method=RequestMethod.GET)
	public ResponseEntity<List<Stock>> getAllStocks() {
		return stockService.getAllStocks();
	}
	
	@RequestMapping(value="/stocks/id/{id}",method=RequestMethod.GET)
	public Stock getAllStocks(@PathVariable("id") int stockId) {
		return stockService.getAStockForId(stockId);
	}
}
