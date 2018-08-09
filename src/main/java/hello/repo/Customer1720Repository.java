package hello.repo;

import hello.model.Customer1720;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1720Repository extends CrudRepository<Customer1720, Long> {

    List<Customer1720> findByLastName(String lastName);
}
