package hello.repo;

import hello.model.Customer853;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer853Repository extends CrudRepository<Customer853, Long> {

    List<Customer853> findByLastName(String lastName);
}
