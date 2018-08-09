package hello.repo;

import hello.model.Customer1437;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1437Repository extends CrudRepository<Customer1437, Long> {

    List<Customer1437> findByLastName(String lastName);
}
