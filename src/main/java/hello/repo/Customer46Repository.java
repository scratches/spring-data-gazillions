package hello.repo;

import hello.model.Customer46;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer46Repository extends CrudRepository<Customer46, Long> {

    List<Customer46> findByLastName(String lastName);
}
