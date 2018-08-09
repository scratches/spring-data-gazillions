package hello.repo;

import hello.model.Customer1454;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1454Repository extends CrudRepository<Customer1454, Long> {

    List<Customer1454> findByLastName(String lastName);
}
