package com.neppplus.loginlogicproject_20211113

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOK.setOnClickListener {

        val loginID = edtId.text.toString()
        val loginPwd = edtPwd.text.toString()

            if(loginID == "admin" && loginPwd == "qwer" ){
                Log.d("조건문01","어드민")
                Toast.makeText(this, "반갑습니다. 관리자님", Toast.LENGTH_SHORT).show()
            }
            else{
                Log.d("조건문01","오류")
                Toast.makeText(this, "로그인에 실패했습니다", Toast.LENGTH_SHORT).show()
            }


        }

    }
}