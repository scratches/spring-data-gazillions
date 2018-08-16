package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer404Repository;

@Service
public class Customer404Service {
	public Customer404Service(Customer404Repository repo) {
	}
}
