package hello.repo;

import hello.model.Customer1062;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1062Repository extends CrudRepository<Customer1062, Long> {

    List<Customer1062> findByLastName(String lastName);
}
