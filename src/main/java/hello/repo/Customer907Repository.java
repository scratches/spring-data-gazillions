package hello.repo;

import hello.model.Customer907;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer907Repository extends CrudRepository<Customer907, Long> {

    List<Customer907> findByLastName(String lastName);
}
