package hello.repo;

import hello.model.Customer1847;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1847Repository extends CrudRepository<Customer1847, Long> {

    List<Customer1847> findByLastName(String lastName);
}
