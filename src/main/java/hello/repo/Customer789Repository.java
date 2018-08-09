package hello.repo;

import hello.model.Customer789;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer789Repository extends CrudRepository<Customer789, Long> {

    List<Customer789> findByLastName(String lastName);
}
