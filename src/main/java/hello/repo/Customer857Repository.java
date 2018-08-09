package hello.repo;

import hello.model.Customer857;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer857Repository extends CrudRepository<Customer857, Long> {

    List<Customer857> findByLastName(String lastName);
}
