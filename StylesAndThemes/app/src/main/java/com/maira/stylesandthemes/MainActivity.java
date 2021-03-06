package com.maira.stylesandthemes;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences mPrefs;
    SharedPreferences.Editor prefEditor;

    public static final String EXTRA_MESSAGE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /* Instantiation of the preferences variable */
        mPrefs = getPreferences(MODE_PRIVATE);
        /* Read from the preferences a username */
        String username = mPrefs.getString("username", "");
        Boolean darkTheme = mPrefs.getBoolean("darkTheme", true);
        Log.i("Maira", "DarkTheme Selected: " + darkTheme + " username " + username);
        setTheme(darkTheme ? R.style.DarkAppTheme : R.style.AppTheme);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox theme = (CheckBox) findViewById(R.id.checkBox);
        theme.setChecked(darkTheme);
        ((EditText) findViewById(R.id.userName)).setText(username);
    }

    /** Called when the user taps the Send button */
    public void openColors(View view) {
        Intent intent = new Intent(this, ColorsActivity.class);

        String message = "Using Colors";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the Send button */
    public void openFonts(View view) {
        Intent intent = new Intent(this, FontsActivity.class);

        String message = "Using Fonts";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    /** Called when the user taps the Send button */
    public void openStyles(View view) {
        Intent intent = new Intent(this, StylesActivity.class);

        String message = "Creeating Styles";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

  public void savePreferences(View view) {
     //Take the text for the username edit text and assign it to a variable
      EditText uname = (EditText) findViewById(R.id.userName);
      CheckBox theme = (CheckBox) findViewById(R.id.checkBox);
      Boolean darkTheme = theme.isChecked();
      String username = uname.getText().toString();
      /* open the preferences in the preferences editor to edit them */
      prefEditor = mPrefs.edit();
      /* put in the preferences the username */
      prefEditor.putString("username", username);
      prefEditor.putBoolean("darkTheme", darkTheme);
      prefEditor.commit(); //saves the contents of the preferences editor in the file

      Toast toast = Toast.makeText(getApplicationContext(),
              "Preferences Saved",
              Toast.LENGTH_SHORT);
      toast.show();

  }

}
