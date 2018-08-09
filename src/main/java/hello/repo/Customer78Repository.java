package hello.repo;

import hello.model.Customer78;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer78Repository extends CrudRepository<Customer78, Long> {

    List<Customer78> findByLastName(String lastName);
}
