package hello.repo;

import hello.model.Customer1559;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1559Repository extends CrudRepository<Customer1559, Long> {

    List<Customer1559> findByLastName(String lastName);
}
