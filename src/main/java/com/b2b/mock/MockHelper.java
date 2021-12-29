package com.b2b.mock;

import io.quarkus.logging.Log;
import org.jboss.logging.Logger;

import javax.ws.rs.core.Response;
import java.io.InputStream;

public class MockHelper {

    private  MockHelper() { }

    private static final String CALLED_MOCK_MESSAGE = "called the mock ";

    public static void log(String service) {
        Log.log(Logger.Level.INFO, CALLED_MOCK_MESSAGE + service);
    }

    public static Response response(Response.Status status, String jsonPath) {
        InputStream json = MockHelper.getFileAsIOStream(jsonPath);
        return Response.status(status).entity(json).build();
    }

    public static InputStream getFileAsIOStream(final String fileName)
    {
        InputStream ioStream = MockHelper.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (ioStream == null) {
            throw new IllegalArgumentException(fileName + " is not found");
        }
        return ioStream;
    }
}
