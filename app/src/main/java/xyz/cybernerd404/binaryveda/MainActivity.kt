package xyz.cybernerd404.binaryveda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import xyz.cybernerd404.binaryveda.adapter.ViewPagerAdapter
import xyz.cybernerd404.binaryveda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPagerAdapter = ViewPagerAdapter(this)

        binding.viewPager.adapter = viewPagerAdapter

        binding.viewPager.isUserInputEnabled = true

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->

            tab.text = when (position) {
                0 -> {
                    "Upload"
                }
                1 -> {
                    "Exhibition"
                }
                2 -> {
                    "Revenue"
                }

                else -> "Upload"
            }

        }.attach()

        binding.apply {
            tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_share_black_ic)
            tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_exhibition_ic)
            tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_revenue_ic)
        }

    }
}