package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer365Repository;

@Service
public class Customer365Service {
	public Customer365Service(Customer365Repository repo) {
	}
}
