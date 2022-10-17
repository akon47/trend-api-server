package com.hwans.trendapiserver.service.trend;

import com.hwans.trendapiserver.repository.trend.RealtimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TrendServiceImpl implements TrendService {
    private final RealtimeRepository trendRepository;

    @Override
    public void updateTrends() {
        log.info("updateTrends");
    }
}
