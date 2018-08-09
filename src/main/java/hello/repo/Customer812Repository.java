package hello.repo;

import hello.model.Customer812;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer812Repository extends CrudRepository<Customer812, Long> {

    List<Customer812> findByLastName(String lastName);
}
