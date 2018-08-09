package hello.repo;

import hello.model.Customer1436;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1436Repository extends CrudRepository<Customer1436, Long> {

    List<Customer1436> findByLastName(String lastName);
}
