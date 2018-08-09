package hello.repo;

import hello.model.Customer1716;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1716Repository extends CrudRepository<Customer1716, Long> {

    List<Customer1716> findByLastName(String lastName);
}
