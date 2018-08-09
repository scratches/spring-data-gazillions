package hello.repo;

import hello.model.Customer1290;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1290Repository extends CrudRepository<Customer1290, Long> {

    List<Customer1290> findByLastName(String lastName);
}
