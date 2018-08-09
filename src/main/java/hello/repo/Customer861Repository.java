package hello.repo;

import hello.model.Customer861;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer861Repository extends CrudRepository<Customer861, Long> {

    List<Customer861> findByLastName(String lastName);
}
