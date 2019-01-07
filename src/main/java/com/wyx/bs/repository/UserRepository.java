package com.wyx.bs.repository;


import com.wyx.bs.domain.User;
import org.springframework.data.repository.CrudRepository;


/**
 * 用户仓库.
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
