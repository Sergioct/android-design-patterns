package com.juangabrielgomila.usersettings;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.UUID;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private String prefsName = "UserSharedPreferences";

    private User user = User.getSharedInstance();

    private EditText editBuilding, editFloor, editDesk, editPhone, editEmail;

    private TextView preview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editBuilding = (EditText) findViewById(R.id.et_building);
        editFloor = (EditText) findViewById(R.id.et_floor);
        editDesk = (EditText) findViewById(R.id.et_desk);
        editPhone = (EditText) findViewById(R.id.et_phone);
        editEmail = (EditText) findViewById(R.id.et_email);

        preview = (TextView) findViewById(R.id.tv_preview);

        Button actionLoad = (Button) findViewById(R.id.btn_load);
        Button actionPreview = (Button) findViewById(R.id.btn_preview);
        Button actionSave = (Button) findViewById(R.id.btn_save);


        actionLoad.setOnClickListener(this);
        actionPreview.setOnClickListener(this);
        actionSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_load:
                loadPrefs();
                break;

            case R.id.btn_save:
                user.setBuilding(editBuilding.getText().toString());
                user.setFloor(editFloor.getText().toString());
                user.setDesk(editDesk.getText().toString());
                user.setPhone(editPhone.getText().toString());
                user.setEmail(editEmail.getText().toString());
                savePrefs();
                break;

            case R.id.btn_preview:
                showPreview();
                break;
        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        savePrefs();
    }

    private void loadPrefs(){

        SharedPreferences preferences = getApplicationContext().getSharedPreferences(prefsName, MODE_PRIVATE);

        user.setBuilding(preferences.getString("user_building", "desconocido"));
        user.setFloor(preferences.getString("user_floor", "desconocido"));
        user.setDesk(preferences.getString("user_desk", "desconocido"));
        user.setPhone(preferences.getString("user_phone", "desconocido"));
        user.setEmail(preferences.getString("user_email", "desconocido@desconocido.com"));

        if (preferences.getBoolean("new_user", true)){
            String uuid = UUID.randomUUID().toString();
            Toast.makeText(this, "Hola y bienvenido" + uuid, Toast.LENGTH_SHORT).show();
            preferences.edit().putString("user_uuid", uuid);
            preferences.edit().putBoolean("new_user", false).apply();
        }

    }

    private void savePrefs(){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences(prefsName, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("user_building", user.getBuilding());
        editor.putString("user_floor", user.getFloor());
        editor.putString("user_desk", user.getDesk());
        editor.putString("user_phone", user.getPhone());
        editor.putString("user_email", user.getEmail());

        editor.apply();

    }

    private void showPreview(){
        preview.setText(new StringBuilder()
        .append(user.getBuilding()).append(", ")
        .append(user.getFloor()).append(", ")
        .append(user.getDesk()).append(", ")
        .append(user.getPhone()).append(", ")
        .append(user.getEmail()).append(".")
                .toString()
        );
    }
}
