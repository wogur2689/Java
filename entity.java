//데이터베이스와 직접적으로 연결된 객체로, 주로 ORM 프레임워크를 통해 데이터베이스의 테이블과 매핑.
//특징 : 식별자, 비즈니스 로직 포함 가능, JPA와 같은 ORM과 연동
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // Constructors, getters, setters
}
