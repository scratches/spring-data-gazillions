package hello.repo;

import hello.model.Customer96;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer96Repository extends CrudRepository<Customer96, Long> {

    List<Customer96> findByLastName(String lastName);
}
