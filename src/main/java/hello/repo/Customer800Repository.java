package hello.repo;

import hello.model.Customer800;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer800Repository extends CrudRepository<Customer800, Long> {

    List<Customer800> findByLastName(String lastName);
}
