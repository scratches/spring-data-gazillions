package hello.repo;

import hello.model.Customer797;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer797Repository extends CrudRepository<Customer797, Long> {

    List<Customer797> findByLastName(String lastName);
}
