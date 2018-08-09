package hello.repo;

import hello.model.Customer537;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer537Repository extends CrudRepository<Customer537, Long> {

    List<Customer537> findByLastName(String lastName);
}
