package hello.repo;

import hello.model.Customer1452;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1452Repository extends CrudRepository<Customer1452, Long> {

    List<Customer1452> findByLastName(String lastName);
}
