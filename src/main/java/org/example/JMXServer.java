package org.example;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class JMXServer {
    private static HelloWorld helloWorld;

    public static void main(String[] args) {
        MBeanServer mBeanServer= ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName=new ObjectName("org.example:type=HelloWorld");
    }
}
