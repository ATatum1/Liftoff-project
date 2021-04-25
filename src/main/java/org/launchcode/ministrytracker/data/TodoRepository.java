package org.launchcode.ministrytracker.data;

import org.launchcode.ministrytracker.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer>{


}
