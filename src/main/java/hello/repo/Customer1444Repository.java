package hello.repo;

import hello.model.Customer1444;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1444Repository extends CrudRepository<Customer1444, Long> {

    List<Customer1444> findByLastName(String lastName);
}
