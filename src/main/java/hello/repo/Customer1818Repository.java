package hello.repo;

import hello.model.Customer1818;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1818Repository extends CrudRepository<Customer1818, Long> {

    List<Customer1818> findByLastName(String lastName);
}
