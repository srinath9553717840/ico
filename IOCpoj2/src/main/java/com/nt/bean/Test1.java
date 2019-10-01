package com.nt.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test1 {
public static void main(String[] args) {
	
     FileSystemResource resource=new FileSystemResource("src/main/java/com/nt/bean/application.xml");
     
     XmlBeanFactory factory=new  XmlBeanFactory(resource);
     
     Mark bean=(Mark)factory.getBean("mk",Mark.class);
     
     String result=bean.toString();
     
     System.out.println(result);
	}

}
