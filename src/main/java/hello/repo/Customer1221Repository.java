package hello.repo;

import hello.model.Customer1221;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1221Repository extends CrudRepository<Customer1221, Long> {

    List<Customer1221> findByLastName(String lastName);
}
