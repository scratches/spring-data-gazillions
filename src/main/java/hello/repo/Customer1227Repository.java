package hello.repo;

import hello.model.Customer1227;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1227Repository extends CrudRepository<Customer1227, Long> {

    List<Customer1227> findByLastName(String lastName);
}
