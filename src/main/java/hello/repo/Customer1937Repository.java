package hello.repo;

import hello.model.Customer1937;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1937Repository extends CrudRepository<Customer1937, Long> {

    List<Customer1937> findByLastName(String lastName);
}
