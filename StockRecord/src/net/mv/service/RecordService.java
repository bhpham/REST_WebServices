package net.mv.service;

import java.util.Set;

import net.mv.dao.StockDao;
import net.mv.domain.Record;
import net.mv.pojos.Person;
import net.mv.ws.pojos.Stock;

public class RecordService {

	public Record getRecord(Person person, Set<Stock> stocks) {
		
		Record record = new Record();
		record.setPerson(person);
		record.setStocks(stocks);
		
		return record;
		
	}
	
	public void saveRecord(Record record) {
		StockDao stockDao = new StockDao();
		stockDao.addRecord(record);
	}


}
