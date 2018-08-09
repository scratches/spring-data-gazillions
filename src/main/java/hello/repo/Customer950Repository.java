package hello.repo;

import hello.model.Customer950;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer950Repository extends CrudRepository<Customer950, Long> {

    List<Customer950> findByLastName(String lastName);
}
