package hello.repo;

import hello.model.Customer1873;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1873Repository extends CrudRepository<Customer1873, Long> {

    List<Customer1873> findByLastName(String lastName);
}
