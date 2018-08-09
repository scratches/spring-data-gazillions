package hello.repo;

import hello.model.Customer1657;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1657Repository extends CrudRepository<Customer1657, Long> {

    List<Customer1657> findByLastName(String lastName);
}
