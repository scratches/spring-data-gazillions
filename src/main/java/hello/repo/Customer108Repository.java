package hello.repo;

import hello.model.Customer108;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer108Repository extends CrudRepository<Customer108, Long> {

    List<Customer108> findByLastName(String lastName);
}
