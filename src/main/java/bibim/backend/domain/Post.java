package bibim.backend.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
//@Getter
//@Setter
//public class Post {
//    private Long id;
//    private String title;
//    private String content;
//    private Member member;
//
//    @Builder
//    public Post(String title, String content, Member member) {
//        this.title = title;
//        this.content = content;
//        this.member = member;
//    }
//
//    public static Post post(String title, String content, Member member) {
//        return Post.builder()
//                .title(title)
//                .content(content)
//                .member(member)
//                .build();
//    }
//}

@Setter
@Getter
public class Post {
    private Long id;
    private String title;
    private String content;

}
