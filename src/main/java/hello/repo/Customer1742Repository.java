package hello.repo;

import hello.model.Customer1742;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1742Repository extends CrudRepository<Customer1742, Long> {

    List<Customer1742> findByLastName(String lastName);
}
