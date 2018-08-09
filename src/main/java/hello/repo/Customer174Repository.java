package hello.repo;

import hello.model.Customer174;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer174Repository extends CrudRepository<Customer174, Long> {

    List<Customer174> findByLastName(String lastName);
}
