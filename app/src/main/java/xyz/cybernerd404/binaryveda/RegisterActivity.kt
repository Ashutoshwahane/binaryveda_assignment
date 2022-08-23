package xyz.cybernerd404.binaryveda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import xyz.cybernerd404.binaryveda.adapter.DataAdapter
import xyz.cybernerd404.binaryveda.databinding.ActivityRegisterBinding
import xyz.cybernerd404.binaryveda.model.Demo

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var list: MutableList<Demo>
    private lateinit var adapter: DataAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = arrayListOf()
        adapter = DataAdapter()
        binding.apply {
            dataRV.layoutManager = LinearLayoutManager(this@RegisterActivity)
            dataRV.adapter = adapter
        }

        list.add(Demo(R.drawable.ic_dna_ic))
        list.add(Demo(R.drawable.ic_rectangle_ic))
        list.add(Demo(R.drawable.ic_remote_ic))
        list.add(Demo(R.drawable.ic_star_ic))
        list.add(Demo(R.drawable.ic_wifi_ic))

        adapter.setList(list)

        binding.apply {
            registerTV.setOnClickListener {

                Intent(this@RegisterActivity, MainActivity::class.java).apply {
                    startActivity(this)
                }
            }


        }
    }
}