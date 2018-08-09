package hello.repo;

import hello.model.Customer777;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer777Repository extends CrudRepository<Customer777, Long> {

    List<Customer777> findByLastName(String lastName);
}
