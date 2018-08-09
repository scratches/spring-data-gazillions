package hello.repo;

import hello.model.Customer935;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer935Repository extends CrudRepository<Customer935, Long> {

    List<Customer935> findByLastName(String lastName);
}
