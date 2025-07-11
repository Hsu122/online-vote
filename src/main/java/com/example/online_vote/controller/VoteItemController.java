package com.example.online_vote.controller;

import com.example.online_vote.entity.VoteItem;
// import com.example.online_vote.repository.VoteItemRepository;
import com.example.online_vote.service.VoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/votes")
public class VoteItemController {

    @Autowired
    private VoteService voteService;

    @GetMapping("/items")
    public List<VoteItem> getAllItems() {
        return voteService.getAllVoteItems();
    }

    @PostMapping("/items")
    public VoteItem createItem(@RequestBody VoteItem item) {
        return voteService.createVoteItem(item);
    }

    @PostMapping("/vote")
    public ResponseEntity<String> vote(@RequestParam String voter, @RequestParam Integer itemId) {
        voteService.castVote(voter, itemId);
        return ResponseEntity.ok("Vote successful");
    }
}
