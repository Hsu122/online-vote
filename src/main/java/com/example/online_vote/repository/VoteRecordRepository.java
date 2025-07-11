package com.example.online_vote.repository;

import com.example.online_vote.entity.VoteRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRecordRepository extends JpaRepository<VoteRecord, Integer> {
    
}
