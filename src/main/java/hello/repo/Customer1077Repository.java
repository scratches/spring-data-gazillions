package hello.repo;

import hello.model.Customer1077;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1077Repository extends CrudRepository<Customer1077, Long> {

    List<Customer1077> findByLastName(String lastName);
}
