package com.ofss.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ofss.model.Stock;

@Service
public class StockService {

	public List<Stock> allStocks=new ArrayList<>();
	
	public StockService() {
		Stock s1=new Stock(101, "OFSS", 500.0);
		Stock s2=new Stock(102, "NFLX", 800.0);
		Stock s3=new Stock(103, "GOGLE", 700.0);
		Stock s4=new Stock(104, "AMZON", 900.0);
		Stock s5=new Stock(105, "APPLE", 650.0);
		allStocks.add(s1);
		allStocks.add(s2);
		allStocks.add(s3);
		allStocks.add(s4);
		allStocks.add(s5);
		System.out.println("Stock list is created succesfully");
		
	}
	
	public ResponseEntity<List<Stock>> getAllStocks() {
		return ResponseEntity.ok(allStocks);
	}
	
	public Stock getAStockForId(int stockId) {
		for (Stock s:allStocks) {
			if (s.getStockId()==stockId)
				return s;
		}
		return null;
	}
}
