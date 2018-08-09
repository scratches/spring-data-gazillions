package hello.repo;

import hello.model.Customer1562;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1562Repository extends CrudRepository<Customer1562, Long> {

    List<Customer1562> findByLastName(String lastName);
}
