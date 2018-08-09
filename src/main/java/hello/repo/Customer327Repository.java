package hello.repo;

import hello.model.Customer327;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer327Repository extends CrudRepository<Customer327, Long> {

    List<Customer327> findByLastName(String lastName);
}
