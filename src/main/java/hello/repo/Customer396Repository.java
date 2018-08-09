package hello.repo;

import hello.model.Customer396;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer396Repository extends CrudRepository<Customer396, Long> {

    List<Customer396> findByLastName(String lastName);
}
