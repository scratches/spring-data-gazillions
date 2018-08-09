package hello.repo;

import hello.model.Customer720;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer720Repository extends CrudRepository<Customer720, Long> {

    List<Customer720> findByLastName(String lastName);
}
