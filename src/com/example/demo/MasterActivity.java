package com.example.demo;

import android.app.Activity;
import android.os.Bundle;

public class MasterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_master);
		
		System.out.print("I'm a master!!!");
		
		System.out.print("I'm a local change!!!");
		
		System.out.print("commit master");
	}
}
