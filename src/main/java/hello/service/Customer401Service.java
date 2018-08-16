package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer401Repository;

@Service
public class Customer401Service {
	public Customer401Service(Customer401Repository repo) {
	}
}
