package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer1Repository;

@Service
public class Customer1Service {
	public Customer1Service(Customer1Repository repo) {
	}
}
