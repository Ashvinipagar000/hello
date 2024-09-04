package com.ash.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.ash.Entity.mobile;

@Repository
public class Dao {
	public ArrayList<mobile> fetchAllmobile() {
		System.err.println("i am in dao");
		ArrayList<mobile>mob=new ArrayList<>();
		mob.add(new mobile(12,"realmi",100));
		return mob;
	}

}
