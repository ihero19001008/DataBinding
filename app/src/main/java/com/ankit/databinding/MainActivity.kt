package com.ankit.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.ankit.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val listPost = ArrayList<Post>()
        for ( i in 1..10) {
            val post = Post("$i")
            listPost.add(post)
        }
        adapter = MyAdapter(listPost)
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
    }
}
