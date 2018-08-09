package hello.repo;

import hello.model.Customer58;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer58Repository extends CrudRepository<Customer58, Long> {

    List<Customer58> findByLastName(String lastName);
}
