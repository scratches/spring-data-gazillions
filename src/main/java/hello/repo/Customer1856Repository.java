package hello.repo;

import hello.model.Customer1856;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1856Repository extends CrudRepository<Customer1856, Long> {

    List<Customer1856> findByLastName(String lastName);
}
