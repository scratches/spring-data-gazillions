package hello.repo;

import hello.model.Customer1308;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1308Repository extends CrudRepository<Customer1308, Long> {

    List<Customer1308> findByLastName(String lastName);
}
