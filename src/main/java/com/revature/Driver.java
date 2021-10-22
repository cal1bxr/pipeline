package com.revature;

import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {

		//We first need to create a Javalin object and run the start method to start listening for HTTP requests.
		//start takes the port number as a param
		Javalin app = Javalin.create().start(8081);
		
		/*
		 * This .get method will map GET requests to the endpoint that is given as the first Param to be handled
		 * by the handler. There are methods for any of the HTTP methods/verbs. 
		 */
		app.get("/hello", (ctx)->{ctx.result("Hello Javalin! It's good to meet you on /hello "
				+ "with a GET request");});
		
		app.get("/html", ctx->ctx.html("<h1>Hello Javalin! This should be HTML</h1>"));
		
		app.post("/hello", (ctx)->{ctx.result("Hello Javalin! It's good to meet you on /hello "
				+ "with a POST request");
				ctx.status(203);});

	}

}
