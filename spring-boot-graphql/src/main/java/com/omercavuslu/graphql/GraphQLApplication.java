package com.omercavuslu.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
*   com.coxautodev.graphql.tools.GraphQLQueryResolver   GET YAPABİLMEK İÇİN
*   com.coxautodev.graphql.tools.GraphQLMutationResolver    VERİYİ DEĞİŞTİRMEK İÇİN
*
 */
@SpringBootApplication
public class GraphQLApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphQLApplication.class, args);
    }
}
