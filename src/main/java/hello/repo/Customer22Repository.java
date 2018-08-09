package hello.repo;

import hello.model.Customer22;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer22Repository extends CrudRepository<Customer22, Long> {

    List<Customer22> findByLastName(String lastName);
}
