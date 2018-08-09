package hello.repo;

import hello.model.Customer552;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer552Repository extends CrudRepository<Customer552, Long> {

    List<Customer552> findByLastName(String lastName);
}
