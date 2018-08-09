package hello.repo;

import hello.model.Customer1298;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1298Repository extends CrudRepository<Customer1298, Long> {

    List<Customer1298> findByLastName(String lastName);
}
