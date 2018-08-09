package hello.repo;

import hello.model.Customer413;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer413Repository extends CrudRepository<Customer413, Long> {

    List<Customer413> findByLastName(String lastName);
}
