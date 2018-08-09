package hello.repo;

import hello.model.Customer1726;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1726Repository extends CrudRepository<Customer1726, Long> {

    List<Customer1726> findByLastName(String lastName);
}
