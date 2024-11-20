package com.sk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.entity.JobSeeker;

public interface IJobSeekerRepository extends JpaRepository<JobSeeker, Integer> {

}
