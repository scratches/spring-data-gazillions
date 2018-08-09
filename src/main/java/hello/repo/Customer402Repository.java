package hello.repo;

import hello.model.Customer402;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer402Repository extends CrudRepository<Customer402, Long> {

    List<Customer402> findByLastName(String lastName);
}
