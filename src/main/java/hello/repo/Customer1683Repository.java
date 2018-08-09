package hello.repo;

import hello.model.Customer1683;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1683Repository extends CrudRepository<Customer1683, Long> {

    List<Customer1683> findByLastName(String lastName);
}
