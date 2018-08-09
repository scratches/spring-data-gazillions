package hello.repo;

import hello.model.Customer827;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer827Repository extends CrudRepository<Customer827, Long> {

    List<Customer827> findByLastName(String lastName);
}
