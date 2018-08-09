package hello.repo;

import hello.model.Customer858;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer858Repository extends CrudRepository<Customer858, Long> {

    List<Customer858> findByLastName(String lastName);
}
