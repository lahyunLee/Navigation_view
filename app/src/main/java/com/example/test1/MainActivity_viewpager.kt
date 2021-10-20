package com.example.test1

import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main_viewpager.*
import kotlinx.android.synthetic.main.activity_sub_account.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_my.*

class MainActivity_viewpager : AppCompatActivity() {



    var viewList = ArrayList<View>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_viewpager)



        viewList.add(layoutInflater.inflate(R.layout.fragment_home, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_chat, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_location, null))
        viewList.add(layoutInflater.inflate(R.layout.fragment_my, null))


        viewPager.adapter = pagerAdapter()
        viewPager.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> bottomNavigationView.selectedItemId = R.id.home
                    1 -> bottomNavigationView.selectedItemId = R.id.chat
                    2 -> bottomNavigationView.selectedItemId = R.id.location
                    3 -> bottomNavigationView.selectedItemId = R.id.my

                }

            }
        })


        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> viewPager.setCurrentItem(0)
                R.id.chat -> viewPager.setCurrentItem(1)
                R.id.location -> viewPager.setCurrentItem(2)
                R.id.my -> viewPager.setCurrentItem(3)
            }
            return@setOnItemSelectedListener true
        }

    }
    inner class pagerAdapter : PagerAdapter() {
        override fun getCount() =  viewList.size

        override fun isViewFromObject(view: View, `object`: Any) = view == `object`

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            var curView = viewList[position]
            viewPager.addView(curView)
            return curView
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            viewPager.removeView(`object` as View)
        }
    }
}