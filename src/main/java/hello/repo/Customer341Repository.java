package hello.repo;

import hello.model.Customer341;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer341Repository extends CrudRepository<Customer341, Long> {

    List<Customer341> findByLastName(String lastName);
}
