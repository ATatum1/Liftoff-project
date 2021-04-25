package org.launchcode.ministrytracker.data;


import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import org.launchcode.ministrytracker.models.Members;

@Repository
public interface MemberRepository extends CrudRepository <Members, Integer> {


}
