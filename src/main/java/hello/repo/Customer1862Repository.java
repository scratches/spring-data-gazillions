package hello.repo;

import hello.model.Customer1862;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1862Repository extends CrudRepository<Customer1862, Long> {

    List<Customer1862> findByLastName(String lastName);
}
