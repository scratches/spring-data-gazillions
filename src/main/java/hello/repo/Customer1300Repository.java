package hello.repo;

import hello.model.Customer1300;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1300Repository extends CrudRepository<Customer1300, Long> {

    List<Customer1300> findByLastName(String lastName);
}
