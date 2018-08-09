package hello.repo;

import hello.model.Customer1721;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1721Repository extends CrudRepository<Customer1721, Long> {

    List<Customer1721> findByLastName(String lastName);
}
