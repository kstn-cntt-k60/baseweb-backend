package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.salesroute.SalesRouteConfigDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SalesRouteConfigDayRepository extends JpaRepository<SalesRouteConfigDay, UUID> {
    List<SalesRouteConfigDay> findAll();
}
