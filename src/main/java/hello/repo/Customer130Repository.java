package hello.repo;

import hello.model.Customer130;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer130Repository extends CrudRepository<Customer130, Long> {

    List<Customer130> findByLastName(String lastName);
}
