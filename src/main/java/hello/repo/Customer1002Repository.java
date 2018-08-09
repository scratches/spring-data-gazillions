package hello.repo;

import hello.model.Customer1002;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1002Repository extends CrudRepository<Customer1002, Long> {

    List<Customer1002> findByLastName(String lastName);
}
