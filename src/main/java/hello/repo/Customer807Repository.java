package hello.repo;

import hello.model.Customer807;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer807Repository extends CrudRepository<Customer807, Long> {

    List<Customer807> findByLastName(String lastName);
}
