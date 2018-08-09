package hello.repo;

import hello.model.Customer1612;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1612Repository extends CrudRepository<Customer1612, Long> {

    List<Customer1612> findByLastName(String lastName);
}
