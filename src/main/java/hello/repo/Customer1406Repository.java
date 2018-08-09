package hello.repo;

import hello.model.Customer1406;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1406Repository extends CrudRepository<Customer1406, Long> {

    List<Customer1406> findByLastName(String lastName);
}
