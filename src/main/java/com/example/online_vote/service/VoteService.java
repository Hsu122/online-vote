package com.example.online_vote.service;

import com.example.online_vote.entity.VoteItem;
import com.example.online_vote.repository.VoteItemRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    private VoteItemRepository voteItemRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<VoteItem> getAllVoteItems() {
        return voteItemRepository.findAll();
    }

    public VoteItem createVoteItem(VoteItem item) {
        return voteItemRepository.save(item);
    }

    @Transactional
    public void castVote(String voterName, Integer itemId) {
        entityManager.createNativeQuery("CALL sp_cast_vote(:voterName, :itemId)")
                .setParameter("voterName", voterName)
                .setParameter("itemId", itemId)
                .executeUpdate();
    }
}
