package hello.repo;

import hello.model.Customer494;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer494Repository extends CrudRepository<Customer494, Long> {

    List<Customer494> findByLastName(String lastName);
}
