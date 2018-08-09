package hello.repo;

import hello.model.Customer891;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer891Repository extends CrudRepository<Customer891, Long> {

    List<Customer891> findByLastName(String lastName);
}
