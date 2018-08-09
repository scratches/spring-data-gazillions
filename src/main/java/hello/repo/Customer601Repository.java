package hello.repo;

import hello.model.Customer601;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer601Repository extends CrudRepository<Customer601, Long> {

    List<Customer601> findByLastName(String lastName);
}
