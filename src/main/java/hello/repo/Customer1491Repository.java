package hello.repo;

import hello.model.Customer1491;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1491Repository extends CrudRepository<Customer1491, Long> {

    List<Customer1491> findByLastName(String lastName);
}
