package hello.repo;

import hello.model.Customer1412;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1412Repository extends CrudRepository<Customer1412, Long> {

    List<Customer1412> findByLastName(String lastName);
}
