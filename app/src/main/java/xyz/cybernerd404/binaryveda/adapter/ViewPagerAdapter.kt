package xyz.cybernerd404.binaryveda.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import xyz.cybernerd404.binaryveda.ExibitionFragment
import xyz.cybernerd404.binaryveda.MainActivity
import xyz.cybernerd404.binaryveda.RevenueFragment
import xyz.cybernerd404.binaryveda.UploadFragment


class ViewPagerAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {

        when(position) {
            0 -> {
                return UploadFragment()
            }
            1 -> {
                return ExibitionFragment()
            }
            2 -> {
                return RevenueFragment()
            }


            else -> return UploadFragment()
        }

    }
}