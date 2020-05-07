package com.ankit.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PostViewModel: ViewModel() {
    private val postTitle = MutableLiveData<String>()
    fun bind(post: Post){
        postTitle.value = post.title
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }


}