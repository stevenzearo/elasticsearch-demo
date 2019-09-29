package app.elasticsearch.api;

import app.elasticsearch.api.user.CreateUserRequest;
import app.elasticsearch.api.user.CreateUserResponse;
import core.framework.api.http.HTTPStatus;
import core.framework.api.web.service.POST;
import core.framework.api.web.service.Path;
import core.framework.api.web.service.ResponseStatus;

/**
 * @author steve
 */
public interface UserWebService {

    @POST
    @Path("/user")
    @ResponseStatus(HTTPStatus.CREATED)
    CreateUserResponse create(CreateUserRequest request);
}
