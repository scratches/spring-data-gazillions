package hello.repo;

import hello.model.Customer925;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer925Repository extends CrudRepository<Customer925, Long> {

    List<Customer925> findByLastName(String lastName);
}
