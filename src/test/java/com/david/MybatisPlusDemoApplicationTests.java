package com.david;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Test
    void contextLoads() {
        AtomicInteger atomicInteger = new AtomicInteger();

        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();

        AtomicReference<Integer> atomicReference = new AtomicReference<Integer>();
        atomicReference.compareAndSet(1, 2);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("a", 123);
    }

}
