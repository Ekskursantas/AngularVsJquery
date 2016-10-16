/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.scene.chart.PieChart;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author Zygis
 */
@Path("members")
public class MembersService {

    DataFactory members = new DataFactory();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MembersService
     */
    public MembersService() {
    }

    /**
     * Retrieves representation of an instance of rest.MembersService
     * @return an instance of java.lang.String
     */
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return members.getMembersAsJson();
    }

    /**
     * PUT method for updating or creating an instance of MembersService
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
