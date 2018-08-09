package hello.repo;

import hello.model.Customer555;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer555Repository extends CrudRepository<Customer555, Long> {

    List<Customer555> findByLastName(String lastName);
}
