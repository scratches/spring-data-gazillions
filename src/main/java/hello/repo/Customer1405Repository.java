package hello.repo;

import hello.model.Customer1405;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1405Repository extends CrudRepository<Customer1405, Long> {

    List<Customer1405> findByLastName(String lastName);
}
