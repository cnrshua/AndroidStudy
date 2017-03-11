package com.example.shua.study;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText loginId = (EditText)findViewById(R.id.loginId);
        final EditText loginPassword = (EditText)findViewById(R.id.loginPassword);
        Button loginBtn = (Button)findViewById(R.id.loginBtn);
        TextView register = (TextView)findViewById(R.id.register);
        TextView findPassword = (TextView)findViewById(R.id.findPassword);

        // splash 액티비티 실행
        startActivity(new Intent(this, SplashActivity.class));

        // 로그인 버튼 클릭 시
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                // 아이디, 비밀번호 맞을시 메인액티비티 이동
                if (loginId.getText().toString().equals("test")&&loginPassword.getText().toString().equals("0000")) {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }

                // 아이디 맞고 비밀번호 틀렸을 시 토스트 띄움
                else if (loginId.getText().toString().equals("test")&&!loginPassword.getText().toString().equals("0000")){
                    Toast.makeText(LoginActivity.this, "비밀번호가 틀렸습니다. \n 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                }

                // 비밀번호 맞고 아이디 틀렸을 시 토스트 띄움
                else if (!loginId.getText().toString().equals("test")&&loginPassword.getText().toString().equals("0000")){
                    Toast.makeText(LoginActivity.this, "아이디가 틀렸습니다. \n 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // 회원가입 글씨 누를 시
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "회원가입 페이지", Toast.LENGTH_SHORT).show();
            }
        });

        // 비밀번호 찾기 누를 시
        findPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "비밀번호 찾기 페이지", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
