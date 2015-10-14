package net.mv.week5.rest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long StockId;
	private String stockName;
	private double stockValue;
	
	
	@Override
	public String toString() {
		return "Stock [StockId=" + StockId + ", stockName=" + stockName
				+ ", stockValue=" + stockValue + ", getStockId()="
				+ getStockId() + ", getStockName()=" + getStockName()
				+ ", getStockValue()=" + getStockValue() + "]";
	}
	public long getStockId() {
		return StockId;
	}
	public void setStockId(long stockId) {
		StockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public double getStockValue() {
		return stockValue;
	}
	public void setStockValue(double stockValue) {
		this.stockValue = stockValue;
	}
	
	
}
