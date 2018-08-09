package hello.repo;

import hello.model.Customer932;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer932Repository extends CrudRepository<Customer932, Long> {

    List<Customer932> findByLastName(String lastName);
}
