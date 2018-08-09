package hello.repo;

import hello.model.Customer897;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer897Repository extends CrudRepository<Customer897, Long> {

    List<Customer897> findByLastName(String lastName);
}
