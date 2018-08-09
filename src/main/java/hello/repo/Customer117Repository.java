package hello.repo;

import hello.model.Customer117;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer117Repository extends CrudRepository<Customer117, Long> {

    List<Customer117> findByLastName(String lastName);
}
