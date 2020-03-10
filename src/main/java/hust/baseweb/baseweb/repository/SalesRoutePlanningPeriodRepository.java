package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.salesroute.SalesRoutePlanningPeriod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SalesRoutePlanningPeriodRepository extends JpaRepository<SalesRoutePlanningPeriod, UUID> {
    List<SalesRoutePlanningPeriod> findAll();
}
