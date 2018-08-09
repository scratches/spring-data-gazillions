package hello.repo;

import hello.model.Customer1189;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1189Repository extends CrudRepository<Customer1189, Long> {

    List<Customer1189> findByLastName(String lastName);
}
