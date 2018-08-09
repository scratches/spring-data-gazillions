package hello.repo;

import hello.model.Customer522;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer522Repository extends CrudRepository<Customer522, Long> {

    List<Customer522> findByLastName(String lastName);
}
