package hello.repo;

import hello.model.Customer1067;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1067Repository extends CrudRepository<Customer1067, Long> {

    List<Customer1067> findByLastName(String lastName);
}
