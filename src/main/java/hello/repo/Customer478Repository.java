package hello.repo;

import hello.model.Customer478;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer478Repository extends CrudRepository<Customer478, Long> {

    List<Customer478> findByLastName(String lastName);
}
