package hello.repo;

import hello.model.Customer1999;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1999Repository extends CrudRepository<Customer1999, Long> {

    List<Customer1999> findByLastName(String lastName);
}
