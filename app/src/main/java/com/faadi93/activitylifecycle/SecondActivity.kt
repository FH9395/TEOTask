package com.faadi93.activitylifecycle

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val toast = Toast.makeText(this, "OnCreate_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()

    }

    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, "OnStart_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this, "OnResume_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        val toast = Toast.makeText(this, "OnPause_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "OnStop_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val toast = Toast.makeText(this, "OnDestroy_SecondActivity", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }
}