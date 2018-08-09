package hello.repo;

import hello.model.Customer202;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer202Repository extends CrudRepository<Customer202, Long> {

    List<Customer202> findByLastName(String lastName);
}
