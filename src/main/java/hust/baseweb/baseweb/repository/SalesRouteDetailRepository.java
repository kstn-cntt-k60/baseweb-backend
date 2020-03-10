package hust.baseweb.baseweb.repository;

import hust.baseweb.baseweb.entity.salesroute.SalesRouteDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SalesRouteDetailRepository extends JpaRepository<SalesRouteDetail, UUID> {
    List<SalesRouteDetail> findAll();
}
