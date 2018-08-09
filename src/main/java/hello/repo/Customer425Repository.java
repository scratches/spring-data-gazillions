package hello.repo;

import hello.model.Customer425;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer425Repository extends CrudRepository<Customer425, Long> {

    List<Customer425> findByLastName(String lastName);
}
