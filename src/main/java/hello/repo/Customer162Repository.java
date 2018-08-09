package hello.repo;

import hello.model.Customer162;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer162Repository extends CrudRepository<Customer162, Long> {

    List<Customer162> findByLastName(String lastName);
}
