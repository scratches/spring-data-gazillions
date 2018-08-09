package hello.repo;

import hello.model.Customer351;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer351Repository extends CrudRepository<Customer351, Long> {

    List<Customer351> findByLastName(String lastName);
}
