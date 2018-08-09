package hello.repo;

import hello.model.Customer249;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer249Repository extends CrudRepository<Customer249, Long> {

    List<Customer249> findByLastName(String lastName);
}
