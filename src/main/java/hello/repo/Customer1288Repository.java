package hello.repo;

import hello.model.Customer1288;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1288Repository extends CrudRepository<Customer1288, Long> {

    List<Customer1288> findByLastName(String lastName);
}
