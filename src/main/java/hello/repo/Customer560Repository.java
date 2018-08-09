package hello.repo;

import hello.model.Customer560;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer560Repository extends CrudRepository<Customer560, Long> {

    List<Customer560> findByLastName(String lastName);
}
