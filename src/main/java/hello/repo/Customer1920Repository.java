package hello.repo;

import hello.model.Customer1920;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1920Repository extends CrudRepository<Customer1920, Long> {

    List<Customer1920> findByLastName(String lastName);
}
