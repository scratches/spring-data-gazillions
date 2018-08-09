package hello.repo;

import hello.model.Customer724;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer724Repository extends CrudRepository<Customer724, Long> {

    List<Customer724> findByLastName(String lastName);
}
