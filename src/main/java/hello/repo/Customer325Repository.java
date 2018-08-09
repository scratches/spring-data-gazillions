package hello.repo;

import hello.model.Customer325;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer325Repository extends CrudRepository<Customer325, Long> {

    List<Customer325> findByLastName(String lastName);
}
