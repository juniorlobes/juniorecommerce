package br.com.ads5.appjuniorecommerce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class TelaAberturaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_abertura)

        val intent: Intent = Intent(this,MainActivity::class.java)
        Handler().postDelayed({
            startActivity(intent)
        }, 5000)
    }
}