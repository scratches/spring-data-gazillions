package hello.repo;

import hello.model.Customer13;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer13Repository extends CrudRepository<Customer13, Long> {

    List<Customer13> findByLastName(String lastName);
}
