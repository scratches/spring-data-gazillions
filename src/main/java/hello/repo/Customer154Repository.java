package hello.repo;

import hello.model.Customer154;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer154Repository extends CrudRepository<Customer154, Long> {

    List<Customer154> findByLastName(String lastName);
}
