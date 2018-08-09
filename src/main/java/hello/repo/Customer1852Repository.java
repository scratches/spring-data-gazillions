package hello.repo;

import hello.model.Customer1852;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1852Repository extends CrudRepository<Customer1852, Long> {

    List<Customer1852> findByLastName(String lastName);
}
