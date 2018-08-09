package hello.repo;

import hello.model.Customer1174;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1174Repository extends CrudRepository<Customer1174, Long> {

    List<Customer1174> findByLastName(String lastName);
}
