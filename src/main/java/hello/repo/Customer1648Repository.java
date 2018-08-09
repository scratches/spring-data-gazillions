package hello.repo;

import hello.model.Customer1648;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1648Repository extends CrudRepository<Customer1648, Long> {

    List<Customer1648> findByLastName(String lastName);
}
