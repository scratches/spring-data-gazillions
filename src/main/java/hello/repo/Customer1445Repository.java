package hello.repo;

import hello.model.Customer1445;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1445Repository extends CrudRepository<Customer1445, Long> {

    List<Customer1445> findByLastName(String lastName);
}
