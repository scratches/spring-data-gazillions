package hello.repo;

import hello.model.Customer403;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer403Repository extends CrudRepository<Customer403, Long> {

    List<Customer403> findByLastName(String lastName);
}
