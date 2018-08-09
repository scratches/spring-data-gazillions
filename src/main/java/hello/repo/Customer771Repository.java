package hello.repo;

import hello.model.Customer771;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer771Repository extends CrudRepository<Customer771, Long> {

    List<Customer771> findByLastName(String lastName);
}
