package com.example.thread;

import java.util.ArrayList;
import java.util.List;

public class SynTest1 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            new Thread(() -> {
                synchronized (list){
                    list.add(Thread.currentThread().getName());
                }
//                list.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(list.size());
    }
}
