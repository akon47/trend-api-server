package com.hwans.trendapiserver.repository.trend;

import com.hwans.trendapiserver.entity.trend.Realtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RealtimeRepository extends JpaRepository<Realtime, UUID> {
}
