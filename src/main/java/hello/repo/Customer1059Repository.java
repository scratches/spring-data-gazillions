package hello.repo;

import hello.model.Customer1059;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1059Repository extends CrudRepository<Customer1059, Long> {

    List<Customer1059> findByLastName(String lastName);
}
