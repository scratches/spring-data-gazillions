package hello.repo;

import hello.model.Customer1435;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1435Repository extends CrudRepository<Customer1435, Long> {

    List<Customer1435> findByLastName(String lastName);
}
