package hello.repo;

import hello.model.Customer1029;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1029Repository extends CrudRepository<Customer1029, Long> {

    List<Customer1029> findByLastName(String lastName);
}
