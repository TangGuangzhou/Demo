package com.example.demo;

import android.app.Activity;
import android.os.Bundle;

public class BranchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_branch);
		
		System.out.print("I'm a branch,too!!!");
		System.out.print("I'm a new change!!!");
		System.out.print("I'm a new change");
	}
}
