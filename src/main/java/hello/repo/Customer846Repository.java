package hello.repo;

import hello.model.Customer846;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer846Repository extends CrudRepository<Customer846, Long> {

    List<Customer846> findByLastName(String lastName);
}
