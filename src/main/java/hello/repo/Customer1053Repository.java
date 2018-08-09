package hello.repo;

import hello.model.Customer1053;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1053Repository extends CrudRepository<Customer1053, Long> {

    List<Customer1053> findByLastName(String lastName);
}
