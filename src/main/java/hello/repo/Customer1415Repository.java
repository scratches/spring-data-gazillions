package hello.repo;

import hello.model.Customer1415;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1415Repository extends CrudRepository<Customer1415, Long> {

    List<Customer1415> findByLastName(String lastName);
}
