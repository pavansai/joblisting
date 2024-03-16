package com.pavansai.joblisting.repository;
import com.pavansai.joblisting.model.Post;
import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
