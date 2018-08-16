package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer42Repository;

@Service
public class Customer42Service {
	public Customer42Service(Customer42Repository repo) {
	}
}
