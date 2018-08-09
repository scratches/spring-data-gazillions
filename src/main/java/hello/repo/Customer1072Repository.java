package hello.repo;

import hello.model.Customer1072;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1072Repository extends CrudRepository<Customer1072, Long> {

    List<Customer1072> findByLastName(String lastName);
}
