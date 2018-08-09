package hello.repo;

import hello.model.Customer829;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer829Repository extends CrudRepository<Customer829, Long> {

    List<Customer829> findByLastName(String lastName);
}
