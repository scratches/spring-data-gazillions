package hello.repo;

import hello.model.Customer1989;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1989Repository extends CrudRepository<Customer1989, Long> {

    List<Customer1989> findByLastName(String lastName);
}
