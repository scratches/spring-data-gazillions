package hello.repo;

import hello.model.Customer1831;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1831Repository extends CrudRepository<Customer1831, Long> {

    List<Customer1831> findByLastName(String lastName);
}
