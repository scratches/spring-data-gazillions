package hello.repo;

import hello.model.Customer1387;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1387Repository extends CrudRepository<Customer1387, Long> {

    List<Customer1387> findByLastName(String lastName);
}
