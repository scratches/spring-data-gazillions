package hello.repo;

import hello.model.Customer380;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer380Repository extends CrudRepository<Customer380, Long> {

    List<Customer380> findByLastName(String lastName);
}
