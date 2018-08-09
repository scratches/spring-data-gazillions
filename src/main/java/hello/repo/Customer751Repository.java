package hello.repo;

import hello.model.Customer751;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer751Repository extends CrudRepository<Customer751, Long> {

    List<Customer751> findByLastName(String lastName);
}
