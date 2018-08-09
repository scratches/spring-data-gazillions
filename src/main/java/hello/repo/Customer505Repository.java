package hello.repo;

import hello.model.Customer505;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer505Repository extends CrudRepository<Customer505, Long> {

    List<Customer505> findByLastName(String lastName);
}
