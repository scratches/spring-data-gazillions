package hello.repo;

import hello.model.Customer785;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer785Repository extends CrudRepository<Customer785, Long> {

    List<Customer785> findByLastName(String lastName);
}
