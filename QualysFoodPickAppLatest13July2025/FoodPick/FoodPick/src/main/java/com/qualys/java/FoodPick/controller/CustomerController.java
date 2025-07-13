package com.qualys.java.FoodPick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qualys.java.FoodPick.IdGenerator.GenerateIdImpl;
import com.qualys.java.FoodPick.entity.Customer;
import com.qualys.java.FoodPick.service.CustomerService;

@RestController
@RequestMapping("/foodpick/customers")
public class CustomerController {

	@Autowired(required = true)
	public GenerateIdImpl genId;

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<String> createCustomer(@RequestBody Customer customer) {
		customer.setCustID(genId.generateId());
		System.out.println(customer.getCustID());
		customerService.saveCustomer(customer);
		return ResponseEntity.ok("Done");
	}

	@GetMapping
	public ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		return ResponseEntity.ok(customers);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
		String message = customerService.deleteCustomer(id);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PatchMapping("/{id}")
	public ResponseEntity<String> patchUpdateCustomer(@PathVariable int id, @RequestBody Customer customer) {
		String message = customerService.updatePartDetails(id, customer);
		if (message.contains("successfully")) {
			return ResponseEntity.ok(message);
		} else if (message.contains("Nothing")) {
			return ResponseEntity.badRequest().body(message);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}