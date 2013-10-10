package com.kilo;

import java.util.List;

import com.google.common.collect.ArrayTable;

public interface SpecialService {

    List<HugeSpecialObject> getSpecialObjects();
    
    ArrayTable<Integer, String, Object> getSpecialObjectsLight();
}
