package hello.repo;

import hello.model.Customer1581;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1581Repository extends CrudRepository<Customer1581, Long> {

    List<Customer1581> findByLastName(String lastName);
}
