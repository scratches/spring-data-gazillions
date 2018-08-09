package hello.repo;

import hello.model.Customer45;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer45Repository extends CrudRepository<Customer45, Long> {

    List<Customer45> findByLastName(String lastName);
}
