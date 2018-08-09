package hello.repo;

import hello.model.Customer1889;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1889Repository extends CrudRepository<Customer1889, Long> {

    List<Customer1889> findByLastName(String lastName);
}
