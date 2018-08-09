package hello.repo;

import hello.model.Customer1619;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1619Repository extends CrudRepository<Customer1619, Long> {

    List<Customer1619> findByLastName(String lastName);
}
