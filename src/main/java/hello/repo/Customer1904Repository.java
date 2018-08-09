package hello.repo;

import hello.model.Customer1904;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1904Repository extends CrudRepository<Customer1904, Long> {

    List<Customer1904> findByLastName(String lastName);
}
