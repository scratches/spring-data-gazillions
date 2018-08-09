package hello.repo;

import hello.model.Customer1703;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1703Repository extends CrudRepository<Customer1703, Long> {

    List<Customer1703> findByLastName(String lastName);
}
