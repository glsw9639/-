package bibim.backend.repository;

import bibim.backend.domain.Post;

public interface PostRepository {
    Post save(Post post);
    Post findById(Long id);
}

