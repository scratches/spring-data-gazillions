package hello.repo;

import hello.model.Customer440;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer440Repository extends CrudRepository<Customer440, Long> {

    List<Customer440> findByLastName(String lastName);
}
