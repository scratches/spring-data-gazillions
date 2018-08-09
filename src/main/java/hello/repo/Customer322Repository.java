package hello.repo;

import hello.model.Customer322;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer322Repository extends CrudRepository<Customer322, Long> {

    List<Customer322> findByLastName(String lastName);
}
