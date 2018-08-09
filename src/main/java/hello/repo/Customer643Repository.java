package hello.repo;

import hello.model.Customer643;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer643Repository extends CrudRepository<Customer643, Long> {

    List<Customer643> findByLastName(String lastName);
}
