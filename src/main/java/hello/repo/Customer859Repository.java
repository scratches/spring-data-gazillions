package hello.repo;

import hello.model.Customer859;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer859Repository extends CrudRepository<Customer859, Long> {

    List<Customer859> findByLastName(String lastName);
}
