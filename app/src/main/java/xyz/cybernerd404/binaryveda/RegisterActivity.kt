package xyz.cybernerd404.binaryveda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import xyz.cybernerd404.binaryveda.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            registerTV.setOnClickListener {

                Intent(this@RegisterActivity, MainActivity::class.java).apply {
                    startActivity(this)
                }
            }


        }
    }
}