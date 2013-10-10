
package com.kilo;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ArrayTable;

public class SpecialServiceImpl implements SpecialService {

    @Override
    public List<HugeSpecialObject> getSpecialObjects() {
        List<HugeSpecialObject> results = new ArrayList<>();
        for (int i = 0; i < 6_000_000; i++) {
            HugeSpecialObject obj = new HugeSpecialObject();
            obj.setInt1(i);
            results.add(obj);
        }
        return results;
    }

    @Override
    public ArrayTable<Integer, String, Object> getSpecialObjectsLight() {
        List<Integer> rowKeys = new ArrayList<>();
        List<String> columnKeys = new ArrayList<>();
        columnKeys.add("int1");
        for (int i = 0; i < 6_000_000; i++) {
            rowKeys.add(i);
        }
        ArrayTable<Integer, String, Object> results = ArrayTable.create(
                rowKeys, columnKeys);
        for (int i = 0; i < 6_000_000; i++) {
            results.put(i, "int1", i);
        }
        return results;
    }

}
