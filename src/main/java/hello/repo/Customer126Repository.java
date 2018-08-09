package hello.repo;

import hello.model.Customer126;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer126Repository extends CrudRepository<Customer126, Long> {

    List<Customer126> findByLastName(String lastName);
}
