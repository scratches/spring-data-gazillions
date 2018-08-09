package hello.repo;

import hello.model.Customer141;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer141Repository extends CrudRepository<Customer141, Long> {

    List<Customer141> findByLastName(String lastName);
}
