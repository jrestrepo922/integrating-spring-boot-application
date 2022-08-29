package com.example.gsrestservice;



import org.springframework.data.repository.CrudRepository;

public interface CounterRepository extends CrudRepository<Counter, Long> {}
