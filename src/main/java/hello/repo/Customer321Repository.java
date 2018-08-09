package hello.repo;

import hello.model.Customer321;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer321Repository extends CrudRepository<Customer321, Long> {

    List<Customer321> findByLastName(String lastName);
}
