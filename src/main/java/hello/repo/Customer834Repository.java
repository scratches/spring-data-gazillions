package hello.repo;

import hello.model.Customer834;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer834Repository extends CrudRepository<Customer834, Long> {

    List<Customer834> findByLastName(String lastName);
}
