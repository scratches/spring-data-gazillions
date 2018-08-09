package hello.repo;

import hello.model.Customer460;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer460Repository extends CrudRepository<Customer460, Long> {

    List<Customer460> findByLastName(String lastName);
}
