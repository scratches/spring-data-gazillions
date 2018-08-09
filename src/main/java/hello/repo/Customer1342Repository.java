package hello.repo;

import hello.model.Customer1342;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1342Repository extends CrudRepository<Customer1342, Long> {

    List<Customer1342> findByLastName(String lastName);
}
