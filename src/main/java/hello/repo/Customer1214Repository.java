package hello.repo;

import hello.model.Customer1214;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1214Repository extends CrudRepository<Customer1214, Long> {

    List<Customer1214> findByLastName(String lastName);
}
