package hello.repo;

import hello.model.Customer263;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer263Repository extends CrudRepository<Customer263, Long> {

    List<Customer263> findByLastName(String lastName);
}
