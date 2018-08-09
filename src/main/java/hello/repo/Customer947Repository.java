package hello.repo;

import hello.model.Customer947;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer947Repository extends CrudRepository<Customer947, Long> {

    List<Customer947> findByLastName(String lastName);
}
