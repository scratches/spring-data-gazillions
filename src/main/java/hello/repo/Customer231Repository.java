package hello.repo;

import hello.model.Customer231;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer231Repository extends CrudRepository<Customer231, Long> {

    List<Customer231> findByLastName(String lastName);
}
