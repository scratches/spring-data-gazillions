package hello.repo;

import hello.model.Customer337;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer337Repository extends CrudRepository<Customer337, Long> {

    List<Customer337> findByLastName(String lastName);
}
