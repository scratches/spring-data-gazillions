package hello.repo;

import hello.model.Customer586;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer586Repository extends CrudRepository<Customer586, Long> {

    List<Customer586> findByLastName(String lastName);
}
