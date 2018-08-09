package hello.repo;

import hello.model.Customer542;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer542Repository extends CrudRepository<Customer542, Long> {

    List<Customer542> findByLastName(String lastName);
}
