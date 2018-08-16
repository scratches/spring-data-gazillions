package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer1337Repository;

@Service
public class Customer1337Service {
	public Customer1337Service(Customer1337Repository repo) {
	}
}
