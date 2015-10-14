package net.mv.week5.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("stock")
public class StockResource {

	@Path("retrieve")
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public Stock retrieveStock() {
		Stock stock = new Stock();
		stock.setStockId(0);
		stock.setStockName("Binh");
		stock.setStockValue(50000.00);
		return stock;
	}
	
	@Path("retrieveById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Stock retrieveStockById(@PathParam(value="id") long id){
		Stock stock = new Stock();
		stock.setStockId(id);
		stock.setStockName("Your Stock");
		stock.setStockValue(0);
		
		return stock;
	}
	
	@Path("create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void createStock(Stock stock) {
		
		System.out.println(stock);
	}
	
}
