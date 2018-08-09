package hello.repo;

import hello.model.Customer1561;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1561Repository extends CrudRepository<Customer1561, Long> {

    List<Customer1561> findByLastName(String lastName);
}
