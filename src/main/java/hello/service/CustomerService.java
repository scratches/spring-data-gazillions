package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.CustomerRepository;

@Service
public class CustomerService {
	public CustomerService(CustomerRepository repo) {
	}
}
