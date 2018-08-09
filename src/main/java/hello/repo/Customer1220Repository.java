package hello.repo;

import hello.model.Customer1220;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1220Repository extends CrudRepository<Customer1220, Long> {

    List<Customer1220> findByLastName(String lastName);
}
