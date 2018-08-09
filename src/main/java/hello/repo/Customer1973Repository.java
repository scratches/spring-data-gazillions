package hello.repo;

import hello.model.Customer1973;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1973Repository extends CrudRepository<Customer1973, Long> {

    List<Customer1973> findByLastName(String lastName);
}
