package hello.repo;

import hello.model.Customer483;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer483Repository extends CrudRepository<Customer483, Long> {

    List<Customer483> findByLastName(String lastName);
}
