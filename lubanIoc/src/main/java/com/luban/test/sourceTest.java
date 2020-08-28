package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.bean.IndexUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class sourceTest {
	public static void main ( String[] args ) {
		AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext ( Appconfig.class );
		ac.getBean ( "indexUser", IndexUser.class );

	}



}
