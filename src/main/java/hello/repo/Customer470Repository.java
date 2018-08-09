package hello.repo;

import hello.model.Customer470;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer470Repository extends CrudRepository<Customer470, Long> {

    List<Customer470> findByLastName(String lastName);
}
