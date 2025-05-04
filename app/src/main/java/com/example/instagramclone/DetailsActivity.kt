package com.example.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagramclone.databinding.ActivityDetailsBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val post = intent.getSerializableExtra("post") as? Post

        post?.let {
            binding.textViewDetailUsername.text = it.username
            binding.textViewDetailDescription.text = it.description
            binding.imageViewDetailPost.setImageResource(it.imageResId)
        }
    }
}
