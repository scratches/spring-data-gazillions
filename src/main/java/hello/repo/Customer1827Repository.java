package hello.repo;

import hello.model.Customer1827;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1827Repository extends CrudRepository<Customer1827, Long> {

    List<Customer1827> findByLastName(String lastName);
}
