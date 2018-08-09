package hello.repo;

import hello.model.Customer278;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer278Repository extends CrudRepository<Customer278, Long> {

    List<Customer278> findByLastName(String lastName);
}
