package org.stock.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

    //수행주기
    @Scheduled(cron = "0 0 0 * * *")
    public void yahooFinanceScheduling(){
        //저장되어 있는 회사 목록 조회

        //회사마다 배당금 정보를 새로 스크랩핑

        //스크래핑한 배당금 정보중 데이터 베이스에 없는 경우 저장
    }
}
