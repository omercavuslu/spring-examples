package com.omercavuslu.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link com.coxautodev.graphql.tools.GraphQLQueryResolver}
 * {@link com.coxautodev.graphql.tools.GraphQLMutationResolver}
 *
 */
// localhost:8090/graphiql
@SpringBootApplication
public class GraphQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }
}