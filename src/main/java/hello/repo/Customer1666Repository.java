package hello.repo;

import hello.model.Customer1666;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1666Repository extends CrudRepository<Customer1666, Long> {

    List<Customer1666> findByLastName(String lastName);
}
