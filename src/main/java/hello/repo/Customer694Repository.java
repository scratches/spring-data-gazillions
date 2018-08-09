package hello.repo;

import hello.model.Customer694;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer694Repository extends CrudRepository<Customer694, Long> {

    List<Customer694> findByLastName(String lastName);
}
