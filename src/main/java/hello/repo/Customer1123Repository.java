package hello.repo;

import hello.model.Customer1123;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1123Repository extends CrudRepository<Customer1123, Long> {

    List<Customer1123> findByLastName(String lastName);
}
