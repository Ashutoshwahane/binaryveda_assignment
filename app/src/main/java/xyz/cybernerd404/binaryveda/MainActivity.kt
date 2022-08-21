package xyz.cybernerd404.binaryveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.cybernerd404.binaryveda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent.extras
        val email = intent?.getString("email")
        val name = email?.takeWhile{ it != '@' }

        binding.welcomeTitleTV.text = "Welcome $name"

        binding.logoutTV.setOnClickListener {
            finish()
        }

    }
}