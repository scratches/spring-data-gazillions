package hello.repo;

import hello.model.Customer303;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer303Repository extends CrudRepository<Customer303, Long> {

    List<Customer303> findByLastName(String lastName);
}
