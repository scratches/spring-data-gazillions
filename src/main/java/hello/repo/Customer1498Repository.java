package hello.repo;

import hello.model.Customer1498;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1498Repository extends CrudRepository<Customer1498, Long> {

    List<Customer1498> findByLastName(String lastName);
}
