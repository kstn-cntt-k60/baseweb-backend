package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.SecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SecurityGroupRepository extends JpaRepository<SecurityGroup, Short> {
    List<SecurityGroup> findAll();

    @Query("select max(g.id) as maxId from SecurityGroup g")
    short findMaxId();
}
