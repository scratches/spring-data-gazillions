package hello.repo;

import hello.model.Customer804;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer804Repository extends CrudRepository<Customer804, Long> {

    List<Customer804> findByLastName(String lastName);
}
