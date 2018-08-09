package hello.repo;

import hello.model.Customer655;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer655Repository extends CrudRepository<Customer655, Long> {

    List<Customer655> findByLastName(String lastName);
}
