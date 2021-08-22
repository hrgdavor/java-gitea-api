/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.15.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiException;
import io.gitea.model.CreateHookOption;
import io.gitea.model.CreateLabelOption;
import io.gitea.model.CreateOrgOption;
import io.gitea.model.CreateRepoOption;
import io.gitea.model.CreateTeamOption;
import io.gitea.model.EditHookOption;
import io.gitea.model.EditLabelOption;
import io.gitea.model.EditOrgOption;
import io.gitea.model.EditTeamOption;
import io.gitea.model.Hook;
import io.gitea.model.InlineResponse200;
import io.gitea.model.Label;
import io.gitea.model.Organization;
import io.gitea.model.Repository;
import io.gitea.model.Team;
import io.gitea.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
@Ignore
public class OrganizationApiTest {

    private final OrganizationApi api = new OrganizationApi();

    
    /**
     * Create a repository in an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrgRepoTest() throws ApiException {
        String org = null;
        CreateRepoOption body = null;
        Repository response = api.createOrgRepo(org, body);

        // TODO: test validations
    }
    
    /**
     * Create a repository in an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrgRepoDeprecatedTest() throws ApiException {
        String org = null;
        CreateRepoOption body = null;
        Repository response = api.createOrgRepoDeprecated(org, body);

        // TODO: test validations
    }
    
    /**
     * Add a team member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgAddTeamMemberTest() throws ApiException {
        Long id = null;
        String username = null;
        api.orgAddTeamMember(id, username);

        // TODO: test validations
    }
    
    /**
     * Add a repository to a team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgAddTeamRepositoryTest() throws ApiException {
        Long id = null;
        String org = null;
        String repo = null;
        api.orgAddTeamRepository(id, org, repo);

        // TODO: test validations
    }
    
    /**
     * Conceal a user&#39;s membership
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgConcealMemberTest() throws ApiException {
        String org = null;
        String username = null;
        api.orgConcealMember(org, username);

        // TODO: test validations
    }
    
    /**
     * Create an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgCreateTest() throws ApiException {
        CreateOrgOption organization = null;
        Organization response = api.orgCreate(organization);

        // TODO: test validations
    }
    
    /**
     * Create a hook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgCreateHookTest() throws ApiException {
        String org = null;
        CreateHookOption body = null;
        Hook response = api.orgCreateHook(org, body);

        // TODO: test validations
    }
    
    /**
     * Create a label for an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgCreateLabelTest() throws ApiException {
        String org = null;
        CreateLabelOption body = null;
        Label response = api.orgCreateLabel(org, body);

        // TODO: test validations
    }
    
    /**
     * Create a team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgCreateTeamTest() throws ApiException {
        String org = null;
        CreateTeamOption body = null;
        Team response = api.orgCreateTeam(org, body);

        // TODO: test validations
    }
    
    /**
     * Delete an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgDeleteTest() throws ApiException {
        String org = null;
        api.orgDelete(org);

        // TODO: test validations
    }
    
    /**
     * Delete a hook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgDeleteHookTest() throws ApiException {
        String org = null;
        Long id = null;
        api.orgDeleteHook(org, id);

        // TODO: test validations
    }
    
    /**
     * Delete a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgDeleteLabelTest() throws ApiException {
        String org = null;
        Long id = null;
        api.orgDeleteLabel(org, id);

        // TODO: test validations
    }
    
    /**
     * Remove a member from an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgDeleteMemberTest() throws ApiException {
        String org = null;
        String username = null;
        api.orgDeleteMember(org, username);

        // TODO: test validations
    }
    
    /**
     * Delete a team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgDeleteTeamTest() throws ApiException {
        Long id = null;
        api.orgDeleteTeam(id);

        // TODO: test validations
    }
    
    /**
     * Edit an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgEditTest() throws ApiException {
        String org = null;
        EditOrgOption body = null;
        Organization response = api.orgEdit(org, body);

        // TODO: test validations
    }
    
    /**
     * Update a hook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgEditHookTest() throws ApiException {
        String org = null;
        Long id = null;
        EditHookOption body = null;
        Hook response = api.orgEditHook(org, id, body);

        // TODO: test validations
    }
    
    /**
     * Update a label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgEditLabelTest() throws ApiException {
        String org = null;
        Long id = null;
        EditLabelOption body = null;
        Label response = api.orgEditLabel(org, id, body);

        // TODO: test validations
    }
    
    /**
     * Edit a team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgEditTeamTest() throws ApiException {
        Integer id = null;
        EditTeamOption body = null;
        Team response = api.orgEditTeam(id, body);

        // TODO: test validations
    }
    
    /**
     * Get an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgGetTest() throws ApiException {
        String org = null;
        Organization response = api.orgGet(org);

        // TODO: test validations
    }
    
    /**
     * Get list of organizations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgGetAllTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgGetAll(page, limit);

        // TODO: test validations
    }
    
    /**
     * Get a hook
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgGetHookTest() throws ApiException {
        String org = null;
        Long id = null;
        Hook response = api.orgGetHook(org, id);

        // TODO: test validations
    }
    
    /**
     * Get a single label
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgGetLabelTest() throws ApiException {
        String org = null;
        Long id = null;
        Label response = api.orgGetLabel(org, id);

        // TODO: test validations
    }
    
    /**
     * Get a team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgGetTeamTest() throws ApiException {
        Long id = null;
        Team response = api.orgGetTeam(id);

        // TODO: test validations
    }
    
    /**
     * Check if a user is a member of an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgIsMemberTest() throws ApiException {
        String org = null;
        String username = null;
        api.orgIsMember(org, username);

        // TODO: test validations
    }
    
    /**
     * Check if a user is a public member of an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgIsPublicMemberTest() throws ApiException {
        String org = null;
        String username = null;
        api.orgIsPublicMember(org, username);

        // TODO: test validations
    }
    
    /**
     * List the current user&#39;s organizations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListCurrentUserOrgsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgListCurrentUserOrgs(page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s webhooks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListHooksTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Hook> response = api.orgListHooks(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListLabelsTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Label> response = api.orgListLabels(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListMembersTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListMembers(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s public members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListPublicMembersTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListPublicMembers(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s repos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListReposTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.orgListRepos(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List a particular member of team
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListTeamMemberTest() throws ApiException {
        Long id = null;
        String username = null;
        User response = api.orgListTeamMember(id, username);

        // TODO: test validations
    }
    
    /**
     * List a team&#39;s members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListTeamMembersTest() throws ApiException {
        Long id = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.orgListTeamMembers(id, page, limit);

        // TODO: test validations
    }
    
    /**
     * List a team&#39;s repos
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListTeamReposTest() throws ApiException {
        Long id = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.orgListTeamRepos(id, page, limit);

        // TODO: test validations
    }
    
    /**
     * List an organization&#39;s teams
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListTeamsTest() throws ApiException {
        String org = null;
        Integer page = null;
        Integer limit = null;
        List<Team> response = api.orgListTeams(org, page, limit);

        // TODO: test validations
    }
    
    /**
     * List a user&#39;s organizations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgListUserOrgsTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<Organization> response = api.orgListUserOrgs(username, page, limit);

        // TODO: test validations
    }
    
    /**
     * Publicize a user&#39;s membership
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgPublicizeMemberTest() throws ApiException {
        String org = null;
        String username = null;
        api.orgPublicizeMember(org, username);

        // TODO: test validations
    }
    
    /**
     * Remove a team member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgRemoveTeamMemberTest() throws ApiException {
        Long id = null;
        String username = null;
        api.orgRemoveTeamMember(id, username);

        // TODO: test validations
    }
    
    /**
     * Remove a repository from a team
     *
     * This does not delete the repository, it only removes the repository from the team.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void orgRemoveTeamRepositoryTest() throws ApiException {
        Long id = null;
        String org = null;
        String repo = null;
        api.orgRemoveTeamRepository(id, org, repo);

        // TODO: test validations
    }
    
    /**
     * Search for teams within an organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamSearchTest() throws ApiException {
        String org = null;
        String q = null;
        Boolean includeDesc = null;
        Integer page = null;
        Integer limit = null;
        InlineResponse200 response = api.teamSearch(org, q, includeDesc, page, limit);

        // TODO: test validations
    }
    
}
