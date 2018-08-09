package hello.repo;

import hello.model.Customer1586;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1586Repository extends CrudRepository<Customer1586, Long> {

    List<Customer1586> findByLastName(String lastName);
}
