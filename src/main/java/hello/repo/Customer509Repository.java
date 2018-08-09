package hello.repo;

import hello.model.Customer509;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer509Repository extends CrudRepository<Customer509, Long> {

    List<Customer509> findByLastName(String lastName);
}
