package hello.repo;

import hello.model.Customer726;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer726Repository extends CrudRepository<Customer726, Long> {

    List<Customer726> findByLastName(String lastName);
}
