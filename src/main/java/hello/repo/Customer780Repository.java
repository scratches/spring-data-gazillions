package hello.repo;

import hello.model.Customer780;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer780Repository extends CrudRepository<Customer780, Long> {

    List<Customer780> findByLastName(String lastName);
}
