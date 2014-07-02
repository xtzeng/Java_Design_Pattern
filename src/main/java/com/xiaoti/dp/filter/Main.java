package com.xiaoti.dp.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "大家好:),<script>,敏感，被就业，网页授课没感觉";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter())
		  ;
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		
		fc.addFilter(fc2);
		mp.setFc(fc);
		String result = mp.process();
		
		System.out.println(result);
	}

}
