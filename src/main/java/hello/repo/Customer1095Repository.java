package hello.repo;

import hello.model.Customer1095;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer1095Repository extends CrudRepository<Customer1095, Long> {

    List<Customer1095> findByLastName(String lastName);
}
