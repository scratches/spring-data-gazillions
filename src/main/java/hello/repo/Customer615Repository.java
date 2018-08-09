package hello.repo;

import hello.model.Customer615;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer615Repository extends CrudRepository<Customer615, Long> {

    List<Customer615> findByLastName(String lastName);
}
