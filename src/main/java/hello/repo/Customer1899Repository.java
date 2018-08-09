package hello.repo;

import hello.model.Customer1899;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1899Repository extends CrudRepository<Customer1899, Long> {

    List<Customer1899> findByLastName(String lastName);
}
