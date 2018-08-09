package hello.repo;

import hello.model.Customer438;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer438Repository extends CrudRepository<Customer438, Long> {

    List<Customer438> findByLastName(String lastName);
}
