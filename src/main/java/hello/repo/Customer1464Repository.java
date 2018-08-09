package hello.repo;

import hello.model.Customer1464;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1464Repository extends CrudRepository<Customer1464, Long> {

    List<Customer1464> findByLastName(String lastName);
}
