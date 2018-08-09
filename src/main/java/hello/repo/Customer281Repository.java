package hello.repo;

import hello.model.Customer281;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer281Repository extends CrudRepository<Customer281, Long> {

    List<Customer281> findByLastName(String lastName);
}
