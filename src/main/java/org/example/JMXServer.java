package org.example;

import javax.management.Attribute;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXServer {
    private static HelloWorld helloWorld;

    public static void main(String[] args) throws Exception{
        MBeanServer mBeanServer= ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName=new ObjectName("org.example:type=HelloWorld");
        helloWorld =new HelloWorld();
        mBeanServer.registerMBean(helloWorld,objectName);
        System.out.println("JMX server is runnig...");
        Thread.sleep(Long.MAX_VALUE);
    }
}
