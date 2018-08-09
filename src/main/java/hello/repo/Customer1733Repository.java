package hello.repo;

import hello.model.Customer1733;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1733Repository extends CrudRepository<Customer1733, Long> {

    List<Customer1733> findByLastName(String lastName);
}
