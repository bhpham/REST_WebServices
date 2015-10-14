package net.mv.week5.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

public class StockClient {

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient(new ClientConfig());

		Stock stock = new Stock();

		stock.setStockId(5);
		stock.setStockName("Dell");
		stock.setStockValue(2.8);

		client.target("http://localhost:9090/JerseyExample/rest/stock/create")
				.request()
				.post(Entity.entity(stock, MediaType.APPLICATION_JSON));
		

	}
}
