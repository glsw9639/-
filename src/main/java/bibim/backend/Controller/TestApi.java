package bibim.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Objects;

@RestController
public class TestApi {
    @GetMapping("/test") // 8080 대신에 test 경로 매핑
    public String test(){
        return "2주차 세션 테스트 API 입니다";
    }

    @GetMapping("/test/json")
    public ApiResponse testJson(){
        return ApiResponse.create("2주차 세션 Json 테스트 API 입니다");
    }
}

class PersonBuilder {
    private String name;
    private int age;
    private String gender;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }

    public Person build() {
        if (name == null || gender == null) {
            throw new IllegalArgumentException("Name and gender must be set.");
        }
        return new Person(name, age, gender);
    }
}

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    Person personWithBuilder = new
            PersonBuilder()
            .name("이승우")
            .age(25)
            .gender("male")
            .build();
}

