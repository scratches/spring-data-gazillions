package hello.repo;

import hello.model.Customer1274;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1274Repository extends CrudRepository<Customer1274, Long> {

    List<Customer1274> findByLastName(String lastName);
}
