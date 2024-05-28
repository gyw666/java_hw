package day18;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime对象
/*        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime1==runtime2);*/

        //2.exit 停止虚拟机,system里面的exit实际就是调用了这个
/*        Runtime.getRuntime().exit(0);*/

        //3.获取cpu的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.查看jvm能从系统获取的总内存,单位是byte
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //5.查看jvm已经从系统中获取的总内存的大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //6.剩余内存的大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //7.运行cmd命令
        //shutdown -s默认一分钟后关机
        //shutdown -s -t 指定时间  :指定关机时间
        //shutdown -a 取消关机操作
        //shutdown -r 关机并重启
        Runtime.getRuntime().exec("shutdown -a");
    }
}
