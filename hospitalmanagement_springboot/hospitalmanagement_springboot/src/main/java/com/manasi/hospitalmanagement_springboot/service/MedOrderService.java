package com.manasi.hospitalmanagement_springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.manasi.hospitalmanagement_springboot.dao.EncounterDao;
import com.manasi.hospitalmanagement_springboot.dao.MedOrderDao;
import com.manasi.hospitalmanagement_springboot.dto.Encounter;
import com.manasi.hospitalmanagement_springboot.dto.MedOrder;
import com.manasi.hospitalmanagement_springboot.util.ResponseStructure;
@Service
public class MedOrderService {
	@Autowired
	private MedOrderDao dao;
	@Autowired
	private EncounterDao encounterDao;

	public ResponseStructure<MedOrder> saveMedorder(MedOrder medOrder,int eid) {
		Encounter encounter=encounterDao.findByid(eid);
		ResponseStructure<MedOrder> responseStructure=new ResponseStructure<>();
         medOrder.setEncounter(encounter);
	     responseStructure.setMessage("Medorder Saved Successfully");
	     responseStructure.setStatusCode(HttpStatus.CREATED.value());
	     responseStructure.setData(dao.saveMedorder(medOrder));
		return responseStructure ;
		}
		
	public ResponseStructure<MedOrder> updateMedorder(MedOrder medOrder, int id) {
		MedOrder medOrder2=dao.updateMedorder(medOrder, id);
		ResponseStructure<MedOrder> responseStructure=new ResponseStructure<>();
		if (medOrder2!=null) {
		responseStructure.setMessage("update successfully");
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setData(null);
		return responseStructure;
		}
		else
		{
			responseStructure.setMessage("Id not found");
			responseStructure.setStatusCode(HttpStatus.NOT_MODIFIED.value());
			responseStructure.setData(medOrder);
			return responseStructure;
		}
		
	}

	
		public ResponseStructure<MedOrder> findMedorderid(int id) {
		MedOrder medOrder=dao.findMedorder(id);
		ResponseStructure<MedOrder> responseStructure = new ResponseStructure<>();
		if (medOrder!= null) {
			responseStructure.setMessage("Medorder found successfully");
			
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setData(medOrder);
			return responseStructure;
		}
		else
		{
			responseStructure.setMessage("Medoder NOT FOUND ");
			responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
			responseStructure.setData(medOrder);
			 return responseStructure;
		}

		
	}

	

	public ResponseStructure<MedOrder> deleteMedorder(int id) {
		
		MedOrder medOrder=dao.deleteMedorder(id);
		if (medOrder!=null) {
			ResponseStructure<MedOrder> responseStructure=new ResponseStructure<>();
			 responseStructure.setMessage(" Successfully  deleted");
		     responseStructure.setStatusCode(HttpStatus.OK.value());
		     responseStructure.setData(medOrder);
		     return responseStructure;
	}
		
			ResponseStructure<MedOrder> responseStructure=new ResponseStructure<>();
			 responseStructure.setMessage("Id not found");
		   responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		     return responseStructure;
		     
		}
	

 public ResponseStructure<List<MedOrder>> findAllMedorder() {
		List<MedOrder> medOrders=dao.findAllMedorder();
		if (medOrders!=null) {
			 ResponseStructure<List<MedOrder>>  responseStructure=new ResponseStructure<>();
			responseStructure.setMessage("find Sucessessfully");
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setData(medOrders);
			return responseStructure;
		}
		else
		{
			 ResponseStructure<List<MedOrder>>  responseStructure=new ResponseStructure<>();
				responseStructure.setMessage("No Data Avilable");
				responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
				responseStructure.setData(medOrders);
				return responseStructure;
		}
		
	}

	

	

	
	

	

}



