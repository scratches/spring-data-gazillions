package hello.repo;

import hello.model.Customer1598;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1598Repository extends CrudRepository<Customer1598, Long> {

    List<Customer1598> findByLastName(String lastName);
}
