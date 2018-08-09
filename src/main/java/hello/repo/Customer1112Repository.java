package hello.repo;

import hello.model.Customer1112;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1112Repository extends CrudRepository<Customer1112, Long> {

    List<Customer1112> findByLastName(String lastName);
}
