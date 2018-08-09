package hello.repo;

import hello.model.Customer356;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer356Repository extends CrudRepository<Customer356, Long> {

    List<Customer356> findByLastName(String lastName);
}
