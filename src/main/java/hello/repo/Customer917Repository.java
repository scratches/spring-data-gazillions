package hello.repo;

import hello.model.Customer917;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer917Repository extends CrudRepository<Customer917, Long> {

    List<Customer917> findByLastName(String lastName);
}
