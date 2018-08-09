package hello.repo;

import hello.model.Customer342;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer342Repository extends CrudRepository<Customer342, Long> {

    List<Customer342> findByLastName(String lastName);
}
