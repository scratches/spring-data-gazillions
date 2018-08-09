package hello.repo;

import hello.model.Customer697;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer697Repository extends CrudRepository<Customer697, Long> {

    List<Customer697> findByLastName(String lastName);
}
