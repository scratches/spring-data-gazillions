package hello.repo;

import hello.model.Customer841;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer841Repository extends CrudRepository<Customer841, Long> {

    List<Customer841> findByLastName(String lastName);
}
