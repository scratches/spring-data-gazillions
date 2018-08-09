package hello.repo;

import hello.model.Customer1730;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1730Repository extends CrudRepository<Customer1730, Long> {

    List<Customer1730> findByLastName(String lastName);
}
