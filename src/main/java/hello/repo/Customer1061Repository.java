package hello.repo;

import hello.model.Customer1061;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1061Repository extends CrudRepository<Customer1061, Long> {

    List<Customer1061> findByLastName(String lastName);
}
