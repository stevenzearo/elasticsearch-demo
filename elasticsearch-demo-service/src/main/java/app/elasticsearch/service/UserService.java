package app.elasticsearch.service;

import app.elasticsearch.api.user.CreateUserRequest;
import app.elasticsearch.api.user.CreateUserResponse;
import core.framework.inject.Inject;
import core.framework.json.JSON;
import core.framework.search.ElasticSearch;

/**
 * @author steve
 */
public class UserService {
    @Inject
    ElasticSearch elasticSearch;

    public CreateUserResponse create(CreateUserRequest request) {
        elasticSearch.createIndex("user", JSON.toJSON(request));
        return null;
    }
}
