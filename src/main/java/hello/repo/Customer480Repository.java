package hello.repo;

import hello.model.Customer480;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer480Repository extends CrudRepository<Customer480, Long> {

    List<Customer480> findByLastName(String lastName);
}
