package hello.repo;

import hello.model.Customer1867;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1867Repository extends CrudRepository<Customer1867, Long> {

    List<Customer1867> findByLastName(String lastName);
}
