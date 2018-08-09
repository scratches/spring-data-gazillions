package hello.repo;

import hello.model.Customer914;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer914Repository extends CrudRepository<Customer914, Long> {

    List<Customer914> findByLastName(String lastName);
}
