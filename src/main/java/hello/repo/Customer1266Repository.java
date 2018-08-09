package hello.repo;

import hello.model.Customer1266;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1266Repository extends CrudRepository<Customer1266, Long> {

    List<Customer1266> findByLastName(String lastName);
}
