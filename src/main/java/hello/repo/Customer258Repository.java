package hello.repo;

import hello.model.Customer258;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer258Repository extends CrudRepository<Customer258, Long> {

    List<Customer258> findByLastName(String lastName);
}
