package com.pop.up;

import in.sudoku.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.pop.view.TransparentPanel;
import com.pop.up.PopupWindow;

public class PopupActivity extends Activity {

	private Animation animShow, animHide;
	PopupWindow popup = new PopupWindow();
	
	public void onCreate(Bundle icicle) {

		super.onCreate(icicle);
		
		setContentView(R.layout.popup);

		popup.Popup();
	}
/*
	private void initPopup() {

		final TransparentPanel popup = (TransparentPanel) findViewById(R.id.popup_window);

		// Start out with the popup initially hidden.
		popup.setVisibility(View.GONE);

		animShow = AnimationUtils.loadAnimation(this, R.anim.popup_show);
		animHide = AnimationUtils.loadAnimation(this, R.anim.popup_hide);

		final Button showButton = (Button) findViewById(R.id.show_popup_button);
		final Button hideButton = (Button) findViewById(R.id.hide_popup_button);
		showButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.setVisibility(View.VISIBLE);
				popup.startAnimation(animShow);
				showButton.setEnabled(false);
				hideButton.setEnabled(true);
			}
		});

		hideButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.startAnimation(animHide);
				showButton.setEnabled(true);
				hideButton.setEnabled(false);
				popup.setVisibility(View.GONE);
			}
		});

		final TextView locationName = (TextView) findViewById(R.id.location_name);
		final TextView locationDescription = (TextView) findViewById(R.id.location_description);

		locationName.setText("Android");
		locationDescription
				.setText("The second Android Developer Challenge has begun! In this contest, real-world users will help review and score applications"						
						+ "and the overall winner will take away $250,000. The deadline for submitting an application to the contest is August 31, 2009.");
	}*/
}
