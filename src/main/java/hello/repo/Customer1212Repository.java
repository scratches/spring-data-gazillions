package hello.repo;

import hello.model.Customer1212;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1212Repository extends CrudRepository<Customer1212, Long> {

    List<Customer1212> findByLastName(String lastName);
}
