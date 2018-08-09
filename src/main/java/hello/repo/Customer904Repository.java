package hello.repo;

import hello.model.Customer904;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer904Repository extends CrudRepository<Customer904, Long> {

    List<Customer904> findByLastName(String lastName);
}
