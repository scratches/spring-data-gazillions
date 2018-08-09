package hello.repo;

import hello.model.Customer688;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer688Repository extends CrudRepository<Customer688, Long> {

    List<Customer688> findByLastName(String lastName);
}
