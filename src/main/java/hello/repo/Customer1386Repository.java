package hello.repo;

import hello.model.Customer1386;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1386Repository extends CrudRepository<Customer1386, Long> {

    List<Customer1386> findByLastName(String lastName);
}
