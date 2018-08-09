package hello.repo;

import hello.model.Customer317;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer317Repository extends CrudRepository<Customer317, Long> {

    List<Customer317> findByLastName(String lastName);
}
