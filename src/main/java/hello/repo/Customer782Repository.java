package hello.repo;

import hello.model.Customer782;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer782Repository extends CrudRepository<Customer782, Long> {

    List<Customer782> findByLastName(String lastName);
}
