package hello.repo;

import hello.model.Customer455;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer455Repository extends CrudRepository<Customer455, Long> {

    List<Customer455> findByLastName(String lastName);
}
