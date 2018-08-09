package hello.repo;

import hello.model.Customer518;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer518Repository extends CrudRepository<Customer518, Long> {

    List<Customer518> findByLastName(String lastName);
}
