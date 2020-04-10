package com.my.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.my.practice.adapter.ImageAdapter
import com.my.practice.adapter.DetailAdapter
import com.my.practice.adapter.UsersAdapter
import com.my.practice.model.Detail
import com.my.practice.model.ImageS
import com.my.practice.model.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: MergeAdapter
    lateinit var myDetailAdapter: DetailAdapter
    lateinit var myDetailAdapter1: DetailAdapter
    lateinit var userVerticalAdapter: UsersAdapter
    lateinit var bannerAdapter: ImageAdapter

    val myDetail = Detail(1, "Jhon Smith", "I am writer.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupDataInRecyclerView()
    }

    private fun setupDataInRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        userVerticalAdapter = UsersAdapter(getUser())
        bannerAdapter = ImageAdapter(getBanner())
        myDetailAdapter = DetailAdapter(myDetail)
        myDetailAdapter1 = DetailAdapter(myDetail)
        adapter = MergeAdapter(myDetailAdapter,  userVerticalAdapter, bannerAdapter, myDetailAdapter1)
        recyclerView.adapter = adapter
    }

    fun getUser() = ArrayList<User>().apply {
        add(User(1, "Vijay", "https://www.gstatic.com/webp/gallery/1.webp"))
    }

    fun getBanner() = ImageS(R.drawable.ic_launcher_background)
}
