package hello.repo;

import hello.model.Customer682;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer682Repository extends CrudRepository<Customer682, Long> {

    List<Customer682> findByLastName(String lastName);
}
