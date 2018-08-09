package hello.repo;

import hello.model.Customer838;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer838Repository extends CrudRepository<Customer838, Long> {

    List<Customer838> findByLastName(String lastName);
}
