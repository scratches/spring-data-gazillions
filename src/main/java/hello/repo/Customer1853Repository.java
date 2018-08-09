package hello.repo;

import hello.model.Customer1853;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1853Repository extends CrudRepository<Customer1853, Long> {

    List<Customer1853> findByLastName(String lastName);
}
