package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer101Repository;

@Service
public class Customer101Service {
	public Customer101Service(Customer101Repository repo) {
	}
}
