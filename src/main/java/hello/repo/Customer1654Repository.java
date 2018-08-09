package hello.repo;

import hello.model.Customer1654;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1654Repository extends CrudRepository<Customer1654, Long> {

    List<Customer1654> findByLastName(String lastName);
}