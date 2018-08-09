package hello.repo;

import hello.model.Customer553;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer553Repository extends CrudRepository<Customer553, Long> {

    List<Customer553> findByLastName(String lastName);
}
