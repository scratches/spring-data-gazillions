package hello.repo;

import hello.model.Customer742;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer742Repository extends CrudRepository<Customer742, Long> {

    List<Customer742> findByLastName(String lastName);
}
