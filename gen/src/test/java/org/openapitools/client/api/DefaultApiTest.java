/*
 * TaskManager API
 * TaskManager API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import java.math.BigDecimal;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * POST tasks/{id}/notes/
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNotesToTaskTest() throws ApiException {
        BigDecimal id = null;
        api.addNotesToTask(id);

        // TODO: test validations
    }
    
    /**
     * POST tasks/
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTaskTest() throws ApiException {
        api.createTask();

        // TODO: test validations
    }
    
    /**
     * DELETE tasks/{id}/notes/
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAllNotesByTaskIdTest() throws ApiException {
        BigDecimal id = null;
        api.deleteAllNotesByTaskId(id);

        // TODO: test validations
    }
    
    /**
     * DELETE tasks/{id}
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskByIdTest() throws ApiException {
        BigDecimal id = null;
        api.deleteTaskById(id);

        // TODO: test validations
    }
    
    /**
     * PATCH tasks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editTaskByIdTest() throws ApiException {
        api.editTaskById();

        // TODO: test validations
    }
    
    /**
     * GET tasks/{id}/notes/
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNotesByTaskIdTest() throws ApiException {
        BigDecimal id = null;
        api.getAllNotesByTaskId(id);

        // TODO: test validations
    }
    
    /**
     * GET tasks/
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTasksTest() throws ApiException {
        api.getAllTasks();

        // TODO: test validations
    }
    
    /**
     * GET tasks/{id}
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskByIdTest() throws ApiException {
        BigDecimal id = null;
        api.getTaskById(id);

        // TODO: test validations
    }
    
}