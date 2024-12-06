//기존 코드. java 16이전
import lombok.Getter;

@Getter
public class TestDto {

    private Long id;

    private String title;

    private String content;

    public TestDto(TestEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
//java 16 이후 record 사용시

public record TestDto (
    Long id,
    String title,
    String content,
) {
    public TestDto(TestEntity entity){
        this(entity.getId(), entity.getTitle(), entity.getContent());
    }
}

/**
 * 장점 : 코드가 훨씬 간결해 짐.
 * 필드에는 기본적으로 final이 적용되다보니. 불변성이 강조됨.
 * 모든 멤버변수를 인수로 가지는 생성자를 자동으로 생성.
 * Getter, equals, hashcode, toString 기본적으로 사용 가능.
 */
  
