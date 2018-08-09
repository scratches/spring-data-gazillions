package hello.repo;

import hello.model.Customer1200;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1200Repository extends CrudRepository<Customer1200, Long> {

    List<Customer1200> findByLastName(String lastName);
}
