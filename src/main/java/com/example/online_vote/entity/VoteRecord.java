package com.example.online_vote.entity;

import jakarta.persistence.*;

@Entity
public class VoteRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String voterName;

    @ManyToOne
    @JoinColumn(name = "vote_item_id")
    private VoteItem voteItem;

    public VoteRecord() {
    }

    public VoteRecord(String voterName, VoteItem voteItem) {
        this.voterName = voterName;
        this.voteItem = voteItem;
    }

    public Integer getId() { 
        return id;
    }
    public void setId(Integer id) { 
        this.id = id; 
    }

    public String getVoterName() { 
        return voterName; 
    }
    public void setVoterName(String voterName) { 
        this.voterName = voterName; 
    }

    public VoteItem getVoteItem() { 
        return voteItem; 
    }
    public void setVoteItem(VoteItem voteItem) { 
        this.voteItem = voteItem; 
    }
}
