package com.tgv.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tgv.Dao.AdminDao;
import org.tgv.pojo.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
// cambio el adminForm que viene del admin controller con . instancio clase anonima . O: . 
	
	public boolean save(Admin admin) {
		admin.setFechaCreacion(new Timestamp (new Date().getTime()));
	
		return adminDao.save(admin);
	}
	
	
	public List<Admin> mostarTodos() {
		
		return adminDao.buscarTodos();
	}
	
}
