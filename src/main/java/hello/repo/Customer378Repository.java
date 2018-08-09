package hello.repo;

import hello.model.Customer378;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer378Repository extends CrudRepository<Customer378, Long> {

    List<Customer378> findByLastName(String lastName);
}
