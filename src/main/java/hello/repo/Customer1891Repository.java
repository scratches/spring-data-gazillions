package hello.repo;

import hello.model.Customer1891;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1891Repository extends CrudRepository<Customer1891, Long> {

    List<Customer1891> findByLastName(String lastName);
}
