package hello.repo;

import hello.model.Customer1988;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1988Repository extends CrudRepository<Customer1988, Long> {

    List<Customer1988> findByLastName(String lastName);
}
