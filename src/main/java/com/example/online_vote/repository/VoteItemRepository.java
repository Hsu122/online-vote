package com.example.online_vote.repository;

import com.example.online_vote.entity.VoteItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteItemRepository extends JpaRepository<VoteItem, Integer> {
    
}
