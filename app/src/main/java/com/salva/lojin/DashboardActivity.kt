package com.salva.lojin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val welcomeTextView = findViewById<TextView>(R.id.tvWelcome)
        val logoutButton = findViewById<Button>(R.id.btnLogout)

        // Ambil email dari intent (jika ada)
        val email = intent.getStringExtra("email")
        welcomeTextView.text = "Selamat datang, $email!"

        // Tombol Logout kembali ke LoginActivity
        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}
