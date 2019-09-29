package app.elasticsearch.api.user;

import jdk.nashorn.internal.objects.annotations.Property;

/**
 * @author steve
 */
public class CreateUserResponse {
    @Property(name = "name")
    String name;

    @Property(name = "age")
    Integer age;
}
