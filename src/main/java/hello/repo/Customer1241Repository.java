package hello.repo;

import hello.model.Customer1241;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1241Repository extends CrudRepository<Customer1241, Long> {

    List<Customer1241> findByLastName(String lastName);
}
