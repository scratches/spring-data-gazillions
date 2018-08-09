package hello.repo;

import hello.model.Customer241;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer241Repository extends CrudRepository<Customer241, Long> {

    List<Customer241> findByLastName(String lastName);
}
