package hello.repo;

import hello.model.Customer906;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer906Repository extends CrudRepository<Customer906, Long> {

    List<Customer906> findByLastName(String lastName);
}
