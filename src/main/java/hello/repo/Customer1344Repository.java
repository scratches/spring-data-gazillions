package hello.repo;

import hello.model.Customer1344;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1344Repository extends CrudRepository<Customer1344, Long> {

    List<Customer1344> findByLastName(String lastName);
}
