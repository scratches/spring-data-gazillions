package hello.repo;

import hello.model.Customer1172;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1172Repository extends CrudRepository<Customer1172, Long> {

    List<Customer1172> findByLastName(String lastName);
}
