package hello.repo;

import hello.model.Customer1750;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1750Repository extends CrudRepository<Customer1750, Long> {

    List<Customer1750> findByLastName(String lastName);
}
