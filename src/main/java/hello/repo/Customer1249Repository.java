package hello.repo;

import hello.model.Customer1249;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1249Repository extends CrudRepository<Customer1249, Long> {

    List<Customer1249> findByLastName(String lastName);
}
