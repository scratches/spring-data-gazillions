package hello.repo;

import hello.model.Customer1520;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1520Repository extends CrudRepository<Customer1520, Long> {

    List<Customer1520> findByLastName(String lastName);
}
