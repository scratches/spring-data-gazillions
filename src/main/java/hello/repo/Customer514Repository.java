package hello.repo;

import hello.model.Customer514;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer514Repository extends CrudRepository<Customer514, Long> {

    List<Customer514> findByLastName(String lastName);
}
