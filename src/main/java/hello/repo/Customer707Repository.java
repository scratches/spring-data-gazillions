package hello.repo;

import hello.model.Customer707;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer707Repository extends CrudRepository<Customer707, Long> {

    List<Customer707> findByLastName(String lastName);
}
