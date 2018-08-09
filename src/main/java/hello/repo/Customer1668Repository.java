package hello.repo;

import hello.model.Customer1668;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1668Repository extends CrudRepository<Customer1668, Long> {

    List<Customer1668> findByLastName(String lastName);
}
