package com.company;

// Create a second thread
class NewThread implements Runnable {
    Thread t;

    NewThread(){

        t=new Thread(this, "DemoThread");
        System.out.println("Child Thread: " + t);
        t.start();
    }

    public void run(){
        try
        {
            for(int i=5;i>0;i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(2000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting Child Thread");
    }
}




class Main {
    public static void main(String args[])
    {
        new NewThread();
        //t.setName("My Thread");
        //System.out.println("After name change:"+ t);

        try{
            for(int i=5;i>0;i--) {
                System.out.println("Main Thread" + i);
                Thread.sleep(500);
            }
        }

        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }

        System.out.println("Main thread exiting");
    }



package com.company;

class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");

        try{
            for(int i=4;i>0;i--) {
                System.out.println("Main Thread" + i);
                Thread.sleep(100);
            }}
        catch(InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }

        System.out.println("Main thread exiting");

        alpha.start();
        beta.start();
    }
    public void run() {
        try{
            for(int i=0;i<4;i++) {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + "is running");
                Thread.sleep(1000);
            }}
        catch(InterruptedException e) {
            System.out.println(Thread.currentThread()+"interrupted");
        }
        System.out.println("Exiting "+Thread.currentThread().getName());
    }
}

