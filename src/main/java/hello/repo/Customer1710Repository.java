package hello.repo;

import hello.model.Customer1710;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1710Repository extends CrudRepository<Customer1710, Long> {

    List<Customer1710> findByLastName(String lastName);
}
