package hello.repo;

import hello.model.Customer1230;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1230Repository extends CrudRepository<Customer1230, Long> {

    List<Customer1230> findByLastName(String lastName);
}
