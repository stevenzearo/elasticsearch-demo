package app.elasticsearch.domain;

import core.framework.search.Index;

/**
 * @author steve
 */
@Index(name = "user")
public class User {
    public String name;

    public Integer age;
}
