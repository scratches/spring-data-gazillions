package hello.repo;

import hello.model.Customer1205;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1205Repository extends CrudRepository<Customer1205, Long> {

    List<Customer1205> findByLastName(String lastName);
}
