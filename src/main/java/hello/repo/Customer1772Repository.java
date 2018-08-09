package hello.repo;

import hello.model.Customer1772;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1772Repository extends CrudRepository<Customer1772, Long> {

    List<Customer1772> findByLastName(String lastName);
}
