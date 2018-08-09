package hello.repo;

import hello.model.Customer104;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer104Repository extends CrudRepository<Customer104, Long> {

    List<Customer104> findByLastName(String lastName);
}
