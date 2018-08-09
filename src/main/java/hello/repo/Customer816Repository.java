package hello.repo;

import hello.model.Customer816;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer816Repository extends CrudRepository<Customer816, Long> {

    List<Customer816> findByLastName(String lastName);
}
