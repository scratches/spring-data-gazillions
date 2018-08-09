package hello.repo;

import hello.model.Customer892;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer892Repository extends CrudRepository<Customer892, Long> {

    List<Customer892> findByLastName(String lastName);
}
