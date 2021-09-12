package com.haseeb.ScheduleApp.repository;

import com.haseeb.ScheduleApp.entity.TrendingIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendingIssueRepository extends JpaRepository<TrendingIssue, Long> {
}
