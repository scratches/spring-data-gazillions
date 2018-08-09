package hello.repo;

import hello.model.Customer1954;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1954Repository extends CrudRepository<Customer1954, Long> {

    List<Customer1954> findByLastName(String lastName);
}
