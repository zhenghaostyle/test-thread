package com.zh;

/**
 * Description: <BR>
 * <p>

 * @date 2017/12/14 13:27
 */
public class CreateThread extends Thread {

    @Override
    public void run(){
        while(true){
            System.out.println("this thread name is :"+Thread.currentThread().getName());
        }
    }

}
