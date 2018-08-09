package hello.repo;

import hello.model.Customer578;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer578Repository extends CrudRepository<Customer578, Long> {

    List<Customer578> findByLastName(String lastName);
}
