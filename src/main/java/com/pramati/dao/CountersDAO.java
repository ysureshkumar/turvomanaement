package com.pramati.dao;

import java.util.List;

import com.pramati.model.Token;

public interface CountersDAO {
public String getServices(Integer counterId);
public String getCounterType(Integer counterId);
public List<Integer> getCounters(String service);
public List<Token>  getPendingTokens();  
}
