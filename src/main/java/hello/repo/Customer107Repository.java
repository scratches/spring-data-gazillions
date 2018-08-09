package hello.repo;

import hello.model.Customer107;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer107Repository extends CrudRepository<Customer107, Long> {

    List<Customer107> findByLastName(String lastName);
}
