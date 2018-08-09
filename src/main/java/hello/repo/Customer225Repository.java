package hello.repo;

import hello.model.Customer225;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer225Repository extends CrudRepository<Customer225, Long> {

    List<Customer225> findByLastName(String lastName);
}
