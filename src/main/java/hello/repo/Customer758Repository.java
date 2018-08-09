package hello.repo;

import hello.model.Customer758;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer758Repository extends CrudRepository<Customer758, Long> {

    List<Customer758> findByLastName(String lastName);
}
