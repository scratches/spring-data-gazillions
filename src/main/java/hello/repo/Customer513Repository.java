package hello.repo;

import hello.model.Customer513;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer513Repository extends CrudRepository<Customer513, Long> {

    List<Customer513> findByLastName(String lastName);
}
