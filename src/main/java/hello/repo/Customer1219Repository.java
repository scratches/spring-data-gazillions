package hello.repo;

import hello.model.Customer1219;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1219Repository extends CrudRepository<Customer1219, Long> {

    List<Customer1219> findByLastName(String lastName);
}
