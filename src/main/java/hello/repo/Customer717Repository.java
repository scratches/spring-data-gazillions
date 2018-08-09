package hello.repo;

import hello.model.Customer717;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer717Repository extends CrudRepository<Customer717, Long> {

    List<Customer717> findByLastName(String lastName);
}
