package hello.repo;

import hello.model.Customer1343;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1343Repository extends CrudRepository<Customer1343, Long> {

    List<Customer1343> findByLastName(String lastName);
}
