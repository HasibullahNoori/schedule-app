package com.haseeb.ScheduleApp.service;

import com.haseeb.ScheduleApp.entity.Schedule;
import com.haseeb.ScheduleApp.entity.TrendingIssue;
import com.haseeb.ScheduleApp.repository.TrendingIssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TrendingIssueService {

    @Autowired
    TrendingIssueRepository trendingIssueRepository;

    public TrendingIssue addTrendingIssue(TrendingIssue trendingIssue){
        trendingIssue.setReportedDate(new Date());
        return trendingIssueRepository.save(trendingIssue);
    }

    public List<TrendingIssue> getAllTrendingIssue(){
        return trendingIssueRepository.findAll();
    }

    public TrendingIssue getTrendingIssueById(Long id){
        Optional<TrendingIssue> trendingIssue =  trendingIssueRepository.findById(id);
        return trendingIssue.get();
    }

    public TrendingIssue updateTrendingIssue(TrendingIssue trendingIssue){
        return trendingIssueRepository.save(trendingIssue);
    }
}
