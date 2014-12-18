package com.example.demo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.demo.R;

public class Demo1Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo1_layout);
		
		System.out.print("demo branch1");
	}
}
