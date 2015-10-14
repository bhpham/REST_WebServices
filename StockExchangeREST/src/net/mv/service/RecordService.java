package net.mv.service;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mv.dao.StockDao;
import net.mv.domain.Person;
import net.mv.domain.Record;
import net.mv.domain.Stock;


@Path("record")
public class RecordService {

	@Path("create")
	@Produces(MediaType.APPLICATION_XML)
	@GET
	public Record getRecord(Person person, Stock stock) {
		
		Record record = new Record();
		record.setPerson(person);
		record.setStock(stock);
		
		return record;
		
	}
	
	@Path("save")
	@Produces(MediaType.APPLICATION_XML)
	@POST
	public void saveRecord(Record record) {
		StockDao stockDao = new StockDao();
		stockDao.addRecord(record);
	}


}
