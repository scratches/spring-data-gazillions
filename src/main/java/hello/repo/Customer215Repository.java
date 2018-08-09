package hello.repo;

import hello.model.Customer215;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer215Repository extends CrudRepository<Customer215, Long> {

    List<Customer215> findByLastName(String lastName);
}
