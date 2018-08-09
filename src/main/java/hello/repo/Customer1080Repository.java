package hello.repo;

import hello.model.Customer1080;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1080Repository extends CrudRepository<Customer1080, Long> {

    List<Customer1080> findByLastName(String lastName);
}
