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
                if (emailET.text.isNotEmpty() && passwordET.text.isNotEmpty()){
                    Intent(this@RegisterActivity, MainActivity::class.java).apply {
                        putExtra("email", emailET.text.toString())
                        startActivity(this)
                    }
                }else{
                    Toast.makeText(this@RegisterActivity, "Please enter the credentials", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}