package com.david;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author David
 * @descritpion
 * @date 2019/12/1
 */
public class ConcurrentTest extends MybatisPlusDemoApplicationTests{

    public synchronized void add(ArrayList list, int ele) {
        list.add(ele);
    }
    @Test
    public void test() throws InterruptedException {
        List list = new ArrayList<>();
        List list2 = new ArrayList();

        Collections.synchronizedList(list);

        CopyOnWriteArrayList writeArrayList = new CopyOnWriteArrayList();
        writeArrayList.add(1);

        AtomicInteger count  = new AtomicInteger();
        for (int i = 0; i < 50;  i ++) {
            list.add(i);

            int finalI = i;
            new Thread(() -> {
                list2.add(finalI);
            },"thread" + i).start();

            //Thread.sleep(100);
        }

        /*if (Thread.activeCount() > 1) {
            Thread.yield();
        }*/
        Thread.sleep(1000);

        System.out.println("list:" + list.size());
        System.out.println("list2:" + list2.size());

    }
}
