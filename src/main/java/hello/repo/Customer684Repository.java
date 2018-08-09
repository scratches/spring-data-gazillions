package hello.repo;

import hello.model.Customer684;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer684Repository extends CrudRepository<Customer684, Long> {

    List<Customer684> findByLastName(String lastName);
}
