package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1)viewの取得
        val et1: EditText = findViewById(R.id.et1)
        val et2: EditText = findViewById(R.id.et2)
        val btnAdd: Button = findViewById(R.id.btnAdd)
        val tvAns: TextView = findViewById(R.id.tvAns)
        val btnClear: Button = findViewById(R.id.btnClear)

        //2)クリックの処理
        btnAdd.setOnClickListener {

            //4)条件分岐
            if (et1.text.toString() == ("") || et2.text.toString() == ("")) {
                //エ1 トースト
                //Toast.makeText(this)
                //エラー処理-2　アラートダイアログ
                AlertDialog.Builder(this)
                    .setTitle("ERROR!")
                    .setMessage("数字を入力してください")
                    .setPositiveButton("OK", null)
                    .show()
            } else {
                //Edit→string→int に変換
                val sum: Int = et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計は $sum"

            }

            //3)CLEAR処理
            btnClear.setOnClickListener {
                et1.text.clear()
                et2.text.clear()
                tvAns.text = "答え"
            }

        }

        //3)


    }
}