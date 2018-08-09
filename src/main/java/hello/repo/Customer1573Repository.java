package hello.repo;

import hello.model.Customer1573;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1573Repository extends CrudRepository<Customer1573, Long> {

    List<Customer1573> findByLastName(String lastName);
}
