package hello.repo;

import hello.model.Customer17;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer17Repository extends CrudRepository<Customer17, Long> {

    List<Customer17> findByLastName(String lastName);
}
