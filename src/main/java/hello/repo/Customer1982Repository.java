package hello.repo;

import hello.model.Customer1982;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1982Repository extends CrudRepository<Customer1982, Long> {

    List<Customer1982> findByLastName(String lastName);
}
