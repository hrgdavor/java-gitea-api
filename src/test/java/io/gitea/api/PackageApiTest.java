/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.17.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.api;

import io.gitea.ApiException;
import io.gitea.model.ModelPackage;
import io.gitea.model.PackageFile;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackageApi
 */
@Ignore
public class PackageApiTest {

    private final PackageApi api = new PackageApi();

    
    /**
     * Delete a package
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePackageTest() throws ApiException {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        api.deletePackage(owner, type, name, version);

        // TODO: test validations
    }
    
    /**
     * Gets a package
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageTest() throws ApiException {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        ModelPackage response = api.getPackage(owner, type, name, version);

        // TODO: test validations
    }
    
    /**
     * Gets all files of a package
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPackageFilesTest() throws ApiException {
        String owner = null;
        String type = null;
        String name = null;
        String version = null;
        List<PackageFile> response = api.listPackageFiles(owner, type, name, version);

        // TODO: test validations
    }
    
    /**
     * Gets all packages of an owner
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPackagesTest() throws ApiException {
        String owner = null;
        Integer page = null;
        Integer limit = null;
        String type = null;
        String q = null;
        List<ModelPackage> response = api.listPackages(owner, page, limit, type, q);

        // TODO: test validations
    }
    
}