package hello.repo;

import hello.model.Customer18;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer18Repository extends CrudRepository<Customer18, Long> {

    List<Customer18> findByLastName(String lastName);
}
