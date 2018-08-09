package hello.repo;

import hello.model.Customer414;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer414Repository extends CrudRepository<Customer414, Long> {

    List<Customer414> findByLastName(String lastName);
}
