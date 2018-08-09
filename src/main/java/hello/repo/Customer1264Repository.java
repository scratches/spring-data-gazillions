package hello.repo;

import hello.model.Customer1264;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1264Repository extends CrudRepository<Customer1264, Long> {

    List<Customer1264> findByLastName(String lastName);
}
