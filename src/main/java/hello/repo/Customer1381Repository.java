package hello.repo;

import hello.model.Customer1381;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1381Repository extends CrudRepository<Customer1381, Long> {

    List<Customer1381> findByLastName(String lastName);
}
