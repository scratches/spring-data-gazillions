package hello.repo;

import hello.model.Customer1232;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1232Repository extends CrudRepository<Customer1232, Long> {

    List<Customer1232> findByLastName(String lastName);
}
