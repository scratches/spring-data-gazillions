package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer1000Repository;

@Service
public class Customer1000Service {
	public Customer1000Service(Customer1000Repository repo) {
	}
}
