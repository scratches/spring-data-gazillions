package hello.repo;

import hello.model.Customer759;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer759Repository extends CrudRepository<Customer759, Long> {

    List<Customer759> findByLastName(String lastName);
}
