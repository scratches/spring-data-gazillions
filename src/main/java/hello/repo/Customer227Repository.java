package hello.repo;

import hello.model.Customer227;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer227Repository extends CrudRepository<Customer227, Long> {

    List<Customer227> findByLastName(String lastName);
}
