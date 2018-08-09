package hello.repo;

import hello.model.Customer541;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer541Repository extends CrudRepository<Customer541, Long> {

    List<Customer541> findByLastName(String lastName);
}
