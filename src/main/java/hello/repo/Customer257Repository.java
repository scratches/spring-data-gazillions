package hello.repo;

import hello.model.Customer257;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Customer257Repository extends CrudRepository<Customer257, Long> {

    List<Customer257> findByLastName(String lastName);
}
