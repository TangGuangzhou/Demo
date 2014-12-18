package com.example.demo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.demo.R;

public class Demo2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_demo2);
		
		System.out.print("hello world");
	}
}
