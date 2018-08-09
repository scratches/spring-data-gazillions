package hello.repo;

import hello.model.Customer1333;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1333Repository extends CrudRepository<Customer1333, Long> {

    List<Customer1333> findByLastName(String lastName);
}
