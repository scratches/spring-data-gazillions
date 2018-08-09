package hello.repo;

import hello.model.Customer188;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer188Repository extends CrudRepository<Customer188, Long> {

    List<Customer188> findByLastName(String lastName);
}
