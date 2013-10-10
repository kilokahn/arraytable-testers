
package com.kilo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.ArrayTable;

public class SpecialServiceTest {

    private SpecialService specialService = new SpecialServiceImpl();

    @Test
    public void testGetSpecialObjects() {
        List<HugeSpecialObject> specialObjects = specialService
                .getSpecialObjects();
        assertNotNull(specialObjects);
    }

    @Test
    public void testGetSpecialObjectsLight() {
        ArrayTable<Integer,String,Object> specialObjectsLight = specialService
                .getSpecialObjectsLight();
        assertNotNull(specialObjectsLight);
    }
}
