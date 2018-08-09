package hello.repo;

import hello.model.Customer1778;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1778Repository extends CrudRepository<Customer1778, Long> {

    List<Customer1778> findByLastName(String lastName);
}
