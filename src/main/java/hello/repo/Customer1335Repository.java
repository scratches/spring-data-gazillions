package hello.repo;

import hello.model.Customer1335;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1335Repository extends CrudRepository<Customer1335, Long> {

    List<Customer1335> findByLastName(String lastName);
}
