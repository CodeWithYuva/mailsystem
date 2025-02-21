package com.example.demo.packages.service;

import com.example.demo.packages.model.contentdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<contentdata,Integer> {
    @Query("select content from contentdata where day=0")
    public String getcontent();

    @Query("select topic from contentdata where day=0")
    String gettext();
}
