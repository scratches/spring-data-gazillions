package hello.repo;

import hello.model.Customer471;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer471Repository extends CrudRepository<Customer471, Long> {

    List<Customer471> findByLastName(String lastName);
}
