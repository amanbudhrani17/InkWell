package com.springboot.blog.services;

import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
