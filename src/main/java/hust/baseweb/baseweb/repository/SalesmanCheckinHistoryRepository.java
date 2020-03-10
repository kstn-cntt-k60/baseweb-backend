package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.salesroute.SalesmanCheckinHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SalesmanCheckinHistoryRepository extends JpaRepository<SalesmanCheckinHistory, UUID> {
    List<SalesmanCheckinHistory> findAll();
}
