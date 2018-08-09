package hello.repo;

import hello.model.Customer1848;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1848Repository extends CrudRepository<Customer1848, Long> {

    List<Customer1848> findByLastName(String lastName);
}
