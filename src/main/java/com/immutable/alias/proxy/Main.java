package com.immutable.alias.proxy;

import java.lang.reflect.Proxy;

public class Main {

		public static void main(String[] args) {
		  BusinessProcessorImpl bpimpl = new BusinessProcessorImpl();
		  BusinessProcessorHandler handler = new BusinessProcessorHandler(bpimpl);
		  BusinessProcessor bp = (BusinessProcessor) Proxy.newProxyInstance(bpimpl.getClass().getClassLoader(), bpimpl.getClass().getInterfaces(), handler);
		  bp.processBusiness();
		  System.out.println(bp.getClass().getName());
		  
		 }
}
