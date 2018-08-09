package hello.repo;

import hello.model.Customer312;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer312Repository extends CrudRepository<Customer312, Long> {

    List<Customer312> findByLastName(String lastName);
}
