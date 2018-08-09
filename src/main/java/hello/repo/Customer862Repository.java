package hello.repo;

import hello.model.Customer862;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer862Repository extends CrudRepository<Customer862, Long> {

    List<Customer862> findByLastName(String lastName);
}
