package hello.repo;

import hello.model.Customer775;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer775Repository extends CrudRepository<Customer775, Long> {

    List<Customer775> findByLastName(String lastName);
}
