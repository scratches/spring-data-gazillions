package hello.repo;

import hello.model.Customer1146;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1146Repository extends CrudRepository<Customer1146, Long> {

    List<Customer1146> findByLastName(String lastName);
}
