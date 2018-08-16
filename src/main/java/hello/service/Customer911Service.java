package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer911Repository;

@Service
public class Customer911Service {
	public Customer911Service(Customer911Repository repo) {
	}
}
