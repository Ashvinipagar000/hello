package com.ash.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ash.Entity.mobile;
import com.ash.dao.Dao;

@Service
	public class service {
	@Autowired
	Dao dao;
	public ArrayList<mobile> fetcmob() {
		System.err.println("i am in service");
		ArrayList<mobile> mobl=dao.fetchAllmobile();
		return mobl;
	}
	
}
