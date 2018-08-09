package hello.repo;

import hello.model.Customer594;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer594Repository extends CrudRepository<Customer594, Long> {

    List<Customer594> findByLastName(String lastName);
}
