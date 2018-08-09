package hello.repo;

import hello.model.Customer1197;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1197Repository extends CrudRepository<Customer1197, Long> {

    List<Customer1197> findByLastName(String lastName);
}
