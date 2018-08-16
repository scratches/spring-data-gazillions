package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer1001Repository;

@Service
public class Customer1001Service {
	public Customer1001Service(Customer1001Repository repo) {
	}
}
