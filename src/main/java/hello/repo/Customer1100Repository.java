package hello.repo;

import hello.model.Customer1100;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1100Repository extends CrudRepository<Customer1100, Long> {

    List<Customer1100> findByLastName(String lastName);
}
