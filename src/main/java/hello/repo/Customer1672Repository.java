package hello.repo;

import hello.model.Customer1672;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1672Repository extends CrudRepository<Customer1672, Long> {

    List<Customer1672> findByLastName(String lastName);
}
