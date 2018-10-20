/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiException;
import io.gitea.model.CreateKeyOption;
import io.gitea.model.CreateOrgOption;
import io.gitea.model.CreateRepoOption;
import io.gitea.model.CreateUserOption;
import io.gitea.model.EditUserOption;
import io.gitea.model.Organization;
import io.gitea.model.PublicKey;
import io.gitea.model.Repository;
import io.gitea.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Ignore
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    
    /**
     * Create an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminCreateOrgTest() throws ApiException {
        String username = null;
        CreateOrgOption organization = null;
        Organization response = api.adminCreateOrg(username, organization);

        // TODO: test validations
    }
    
    /**
     * Add a public key on behalf of a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminCreatePublicKeyTest() throws ApiException {
        String username = null;
        CreateKeyOption key = null;
        PublicKey response = api.adminCreatePublicKey(username, key);

        // TODO: test validations
    }
    
    /**
     * Create a repository on behalf a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminCreateRepoTest() throws ApiException {
        String username = null;
        CreateRepoOption repository = null;
        Repository response = api.adminCreateRepo(username, repository);

        // TODO: test validations
    }
    
    /**
     * Create a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminCreateUserTest() throws ApiException {
        CreateUserOption body = null;
        User response = api.adminCreateUser(body);

        // TODO: test validations
    }
    
    /**
     * Delete a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminDeleteUserTest() throws ApiException {
        String username = null;
        api.adminDeleteUser(username);

        // TODO: test validations
    }
    
    /**
     * Delete a user&#39;s public key
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminDeleteUserPublicKeyTest() throws ApiException {
        String username = null;
        Long id = null;
        api.adminDeleteUserPublicKey(username, id);

        // TODO: test validations
    }
    
    /**
     * Edit an existing user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void adminEditUserTest() throws ApiException {
        String username = null;
        EditUserOption body = null;
        User response = api.adminEditUser(username, body);

        // TODO: test validations
    }
    
}
