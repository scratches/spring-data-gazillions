package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer360Repository;

@Service
public class Customer360Service {
	public Customer360Service(Customer360Repository repo) {
	}
}
