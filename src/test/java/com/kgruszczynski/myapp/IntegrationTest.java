package com.kgruszczynski.myapp;

import com.kgruszczynski.myapp.config.AsyncSyncConfiguration;
import com.kgruszczynski.myapp.config.EmbeddedKafka;
import com.kgruszczynski.myapp.config.EmbeddedSQL;
import com.kgruszczynski.myapp.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JhipsterSampleApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
