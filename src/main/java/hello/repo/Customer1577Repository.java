package hello.repo;

import hello.model.Customer1577;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1577Repository extends CrudRepository<Customer1577, Long> {

    List<Customer1577> findByLastName(String lastName);
}
