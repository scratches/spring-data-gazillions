package hello.repo;

import hello.model.Customer63;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer63Repository extends CrudRepository<Customer63, Long> {

    List<Customer63> findByLastName(String lastName);
}
