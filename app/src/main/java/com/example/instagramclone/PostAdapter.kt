package com.example.instagramclone

import android.content.ClipData.Item
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramclone.databinding.ItemPostBinding

class PostAdapter {

    class PostAdapter(private val postList : ArrayList<Post>) : RecyclerView.Adapter<PostAdapter.PostHolder>(){

        class PostHolder(val binding : ItemPostBinding) : RecyclerView.ViewHolder(binding.root)

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
            val binding = ItemPostBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return PostHolder(binding)
        }

        override fun getItemCount(): Int {
            return postList.size
        }

        override fun onBindViewHolder(holder: PostHolder, position: Int) {
            val post = postList[position]
            holder.binding.imageViewPost.setImageResource(post.imageResId)
            holder.binding.textViewUsername.text = post.username
            holder.binding.textViewDescription.text = post.description

            holder.itemView.setOnClickListener{

                val intent = Intent(holder.itemView.context,DetailActivity::class.java)
                intent.putExtra("post",post)
                holder.itemView.context.startActivity(intent)



            }
        }


    }
}