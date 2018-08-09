package hello.repo;

import hello.model.Customer848;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer848Repository extends CrudRepository<Customer848, Long> {

    List<Customer848> findByLastName(String lastName);
}
