package hello.service;

import org.springframework.stereotype.Service;

import hello.repo.Customer3Repository;

@Service
public class Customer3Service {
	public Customer3Service(Customer3Repository repo) {
	}
}
