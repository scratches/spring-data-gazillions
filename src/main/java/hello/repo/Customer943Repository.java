package hello.repo;

import hello.model.Customer943;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer943Repository extends CrudRepository<Customer943, Long> {

    List<Customer943> findByLastName(String lastName);
}
