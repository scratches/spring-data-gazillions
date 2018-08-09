package hello.repo;

import hello.model.Customer268;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer268Repository extends CrudRepository<Customer268, Long> {

    List<Customer268> findByLastName(String lastName);
}
