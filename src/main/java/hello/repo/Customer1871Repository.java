package hello.repo;

import hello.model.Customer1871;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1871Repository extends CrudRepository<Customer1871, Long> {

    List<Customer1871> findByLastName(String lastName);
}
