package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.salesroute.SalesRouteConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SalesRouteConfigRepository extends JpaRepository<SalesRouteConfig, UUID> {
    List<SalesRouteConfig> findAll();
}
