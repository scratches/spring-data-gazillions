package hello.repo;

import hello.model.Customer1316;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1316Repository extends CrudRepository<Customer1316, Long> {

    List<Customer1316> findByLastName(String lastName);
}
