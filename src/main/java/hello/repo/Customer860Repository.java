package hello.repo;

import hello.model.Customer860;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer860Repository extends CrudRepository<Customer860, Long> {

    List<Customer860> findByLastName(String lastName);
}
