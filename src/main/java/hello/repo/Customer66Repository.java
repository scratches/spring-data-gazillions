package hello.repo;

import hello.model.Customer66;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer66Repository extends CrudRepository<Customer66, Long> {

    List<Customer66> findByLastName(String lastName);
}
