package bibim.backend.Controller;

import bibim.backend.domain.Post;
import bibim.backend.domain.PostRequest;
import bibim.backend.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping
    public Post createPost(@RequestBody PostRequest request) {
        return postService.createPost(request.getTitle(), request.getContent());
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.findPostById(id);
    }
}
