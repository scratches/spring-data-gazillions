package hello.repo;

import hello.model.Customer1702;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1702Repository extends CrudRepository<Customer1702, Long> {

    List<Customer1702> findByLastName(String lastName);
}
