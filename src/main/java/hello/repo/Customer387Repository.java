package hello.repo;

import hello.model.Customer387;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer387Repository extends CrudRepository<Customer387, Long> {

    List<Customer387> findByLastName(String lastName);
}
