package hello.repo;

import hello.model.Customer739;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer739Repository extends CrudRepository<Customer739, Long> {

    List<Customer739> findByLastName(String lastName);
}
