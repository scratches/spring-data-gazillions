package hello.repo;

import hello.model.Customer562;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer562Repository extends CrudRepository<Customer562, Long> {

    List<Customer562> findByLastName(String lastName);
}
