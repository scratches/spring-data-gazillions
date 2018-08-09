package hello.repo;

import hello.model.Customer1628;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1628Repository extends CrudRepository<Customer1628, Long> {

    List<Customer1628> findByLastName(String lastName);
}
