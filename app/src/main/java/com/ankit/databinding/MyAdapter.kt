package com.ankit.databinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ankit.databinding.databinding.ListItemBinding

class MyAdapter(private val list: List<Post>)  : RecyclerView.Adapter<MyAdapter.ViewHolder>(){

    class ViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val viewModel = PostViewModel()
      fun bind(post: Post) {
            viewModel.bind(post)
            binding.viewModel = viewModel

    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding : ListItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
            R.layout.list_item,
            parent,
            false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {

        }
    }
}