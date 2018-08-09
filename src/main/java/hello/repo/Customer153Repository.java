package hello.repo;

import hello.model.Customer153;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer153Repository extends CrudRepository<Customer153, Long> {

    List<Customer153> findByLastName(String lastName);
}
