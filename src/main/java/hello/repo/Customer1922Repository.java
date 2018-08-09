package hello.repo;

import hello.model.Customer1922;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1922Repository extends CrudRepository<Customer1922, Long> {

    List<Customer1922> findByLastName(String lastName);
}
