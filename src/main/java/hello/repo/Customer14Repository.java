package hello.repo;

import hello.model.Customer14;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer14Repository extends CrudRepository<Customer14, Long> {

    List<Customer14> findByLastName(String lastName);
}
