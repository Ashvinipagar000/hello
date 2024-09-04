package com.ash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ash.service.service;



import com.ash.Entity.mobile;

@RestController
public class controller {
	@Autowired
	service ser;
    @GetMapping("hii")
    public ArrayList<mobile> m1() {
    	System.err.println("i am in dao");
    	ArrayList<mobile>m=ser.fetcmob();
    	return m;
    }
}

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.ash.Entity.mobile; // Make sure this path is correct
import com.ash.service.service; // Correct import for service

@RestController
public class controller { // Use CamelCase for class names

    @Autowired
    private service ser; // Use descriptive names

    @GetMapping("/hii") // Include leading slash for consistency
    public List<mobile> getMobiles() { // Use List instead of ArrayList
        System.err.println("I am in controller");
        return ser.fetcmob(); // Ensure method name matches
    }
}
*/
