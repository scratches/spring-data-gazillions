package hello.repo;

import hello.model.Customer1233;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1233Repository extends CrudRepository<Customer1233, Long> {

    List<Customer1233> findByLastName(String lastName);
}
