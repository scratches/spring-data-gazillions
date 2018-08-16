package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer2Repository;

@Service
public class Customer2Service {
	public Customer2Service(Customer2Repository repo) {
	}
}
