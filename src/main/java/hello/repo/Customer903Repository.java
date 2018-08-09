package hello.repo;

import hello.model.Customer903;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer903Repository extends CrudRepository<Customer903, Long> {

    List<Customer903> findByLastName(String lastName);
}
