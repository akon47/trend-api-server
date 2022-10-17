package com.hwans.trendapiserver.support.schedule;

import com.hwans.trendapiserver.service.trend.TrendService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TrendScheduler {
    private final TrendService trendService;

    @Scheduled(cron = "0 */1 * * * ?")
    private void updatePostHitsFromCache() {
        trendService.updateTrends();
    }
}
