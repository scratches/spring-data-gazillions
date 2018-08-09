package hello.repo;

import hello.model.Customer884;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer884Repository extends CrudRepository<Customer884, Long> {

    List<Customer884> findByLastName(String lastName);
}
