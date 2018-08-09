package hello.repo;

import hello.model.Customer1228;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1228Repository extends CrudRepository<Customer1228, Long> {

    List<Customer1228> findByLastName(String lastName);
}
