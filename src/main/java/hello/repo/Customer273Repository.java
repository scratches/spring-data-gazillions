package hello.repo;

import hello.model.Customer273;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer273Repository extends CrudRepository<Customer273, Long> {

    List<Customer273> findByLastName(String lastName);
}
