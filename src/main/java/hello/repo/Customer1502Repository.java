package hello.repo;

import hello.model.Customer1502;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1502Repository extends CrudRepository<Customer1502, Long> {

    List<Customer1502> findByLastName(String lastName);
}
