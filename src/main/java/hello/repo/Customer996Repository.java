package hello.repo;

import hello.model.Customer996;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer996Repository extends CrudRepository<Customer996, Long> {

    List<Customer996> findByLastName(String lastName);
}
