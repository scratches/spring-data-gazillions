package hello.repo;

import hello.model.Customer1625;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1625Repository extends CrudRepository<Customer1625, Long> {

    List<Customer1625> findByLastName(String lastName);
}
