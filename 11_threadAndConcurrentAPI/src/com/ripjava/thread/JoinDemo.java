package com.ripjava.thread;

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("Main thread 开始...");
        Thread threadB = new Thread() {
            @Override
            public void run() { 
                try { 
                    System.out.println("Thread B 开始..."); 
                    for(int i = 0; i < 5; i++) { 
                        Thread.sleep(1000); 
                        System.out.println("Thread B 执行..."); 
                    }
                    System.out.println("Thread B 将结束..."); 
                } 
                catch(InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        };
        
        threadB.start();

        try {
            // Thread B 加入 Main thread 流程
            threadB.join();
        } 
        catch(InterruptedException e) { 
            e.printStackTrace(); 
        } 
        System.out.println("Main thread 将结束...");
    }    
}
