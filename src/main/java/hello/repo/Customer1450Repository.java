package hello.repo;

import hello.model.Customer1450;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1450Repository extends CrudRepository<Customer1450, Long> {

    List<Customer1450> findByLastName(String lastName);
}
