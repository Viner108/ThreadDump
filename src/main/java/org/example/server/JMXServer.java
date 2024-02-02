package org.example.server;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXServer {

    public static void main(String[] args) throws Exception{
        MBeanServer mBeanServer= ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName=new ObjectName("org.example:type=Hello");
        Hello hello=new Hello();
        mBeanServer.registerMBean(hello,objectName);
        System.out.println("JMX server is runnig...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
