package bibim.backend.repository;

import bibim.backend.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryPostRepository implements PostRepository {
    private final Map<Long, Post> postMap = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public Post save(Post post) {
        post.setId(++sequence);
        postMap.put(post.getId(), post);
        return post;
    }

    @Override
    public Post findById(Long id) {
        return postMap.get(id);
    }
}
