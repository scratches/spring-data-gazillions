package hello.repo;

import hello.model.Customer613;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer613Repository extends CrudRepository<Customer613, Long> {

    List<Customer613> findByLastName(String lastName);
}
