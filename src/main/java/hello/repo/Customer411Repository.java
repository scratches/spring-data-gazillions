package hello.repo;

import hello.model.Customer411;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer411Repository extends CrudRepository<Customer411, Long> {

    List<Customer411> findByLastName(String lastName);
}
