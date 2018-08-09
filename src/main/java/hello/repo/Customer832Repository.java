package hello.repo;

import hello.model.Customer832;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer832Repository extends CrudRepository<Customer832, Long> {

    List<Customer832> findByLastName(String lastName);
}
