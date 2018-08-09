package hello.repo;

import hello.model.Customer1138;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1138Repository extends CrudRepository<Customer1138, Long> {

    List<Customer1138> findByLastName(String lastName);
}
