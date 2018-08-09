package hello.repo;

import hello.model.Customer324;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer324Repository extends CrudRepository<Customer324, Long> {

    List<Customer324> findByLastName(String lastName);
}
