package com.example.instagramclone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagramclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var postList : ArrayList<Post>
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        postList= ArrayList()

        postList.add(Post("ahmet123", "Güzel bir gün!", R.drawable.collesium))
        postList.add(Post("elif_abc", "Manzara harika", R.drawable.eiffel))
        postList.add(Post("mehmet.official", "Tatildeyim 🏖️", R.drawable.london))

        binding.recyclerViewPosts.layoutManager = LinearLayoutManager(this)
        val adapter = PostAdapter.PostAdapter(postList)
        binding.recyclerViewPosts.adapter = adapter





    }
}