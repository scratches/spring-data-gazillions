package hello.repo;

import hello.model.Customer80;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer80Repository extends CrudRepository<Customer80, Long> {

    List<Customer80> findByLastName(String lastName);
}
