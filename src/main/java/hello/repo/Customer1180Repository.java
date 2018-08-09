package hello.repo;

import hello.model.Customer1180;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1180Repository extends CrudRepository<Customer1180, Long> {

    List<Customer1180> findByLastName(String lastName);
}
