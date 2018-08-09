package hello.repo;

import hello.model.Customer31;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer31Repository extends CrudRepository<Customer31, Long> {

    List<Customer31> findByLastName(String lastName);
}
