package microservices.book.multiplication.user;

import lombok.*;

/**
 * Stores information to identify the user.
 */
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class User {

    private Long id;
    private String alias;

    public User(final String userAlias) {
        this(null, userAlias);
    }
}
