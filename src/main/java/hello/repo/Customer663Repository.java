package hello.repo;

import hello.model.Customer663;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer663Repository extends CrudRepository<Customer663, Long> {

    List<Customer663> findByLastName(String lastName);
}
