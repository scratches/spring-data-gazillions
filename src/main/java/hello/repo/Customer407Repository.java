package hello.repo;

import hello.model.Customer407;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer407Repository extends CrudRepository<Customer407, Long> {

    List<Customer407> findByLastName(String lastName);
}
