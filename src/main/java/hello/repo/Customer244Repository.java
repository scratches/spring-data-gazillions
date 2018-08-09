package hello.repo;

import hello.model.Customer244;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer244Repository extends CrudRepository<Customer244, Long> {

    List<Customer244> findByLastName(String lastName);
}
