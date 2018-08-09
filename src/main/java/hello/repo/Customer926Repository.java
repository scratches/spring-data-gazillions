package hello.repo;

import hello.model.Customer926;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer926Repository extends CrudRepository<Customer926, Long> {

    List<Customer926> findByLastName(String lastName);
}
