package io.github.shinusuresh.productsup.client.client;

import io.github.shinusuresh.productsup.client.domain.streams.Data;
import io.github.shinusuresh.productsup.client.domain.streams.create.CreateStream;
import io.github.shinusuresh.productsup.client.domain.streams.create.CreateStreamResponse;
import io.github.shinusuresh.productsup.client.domain.streams.upload.UploadResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.Map;

/**
 * Stream based client for ProductsUp operations <a href="https://api-docs.productsup.io/#stream-api">Stream API's</a>
 */
public interface StreamApiClient {

    /**
     * List all streams.
     * <a href="https://api-docs.productsup.io/#stream-api-stream-management-list-stream">List Stream</a>
     *
     * @return - {@link Data}
     */
    @GetExchange("/streams")
    Data listStreams();

    /**
     * Create stream.
     * <a href="https://api-docs.productsup.io/#stream-api-stream-management-stream-creation">Create Stream
     * </a>
     *
     * @param data - {@link CreateStream}
     * @return - {@link CreateStreamResponse}
     */
    @PostExchange(value = "/streams", contentType = "application/vnd.api+json")
    CreateStreamResponse createStream(@RequestBody CreateStream data);

    /**
     * Referenced Stream upload of product data.
     * The content type of this request <code>application/json</code>
     * <p>
     * <a href="https://api-docs.productsup.io/#stream-api-uploading-data-request-body">Uploading Data</a>
     * </p>
     *
     * @param streamId - Stream Id.
     * @return - {@link UploadResponse}
     */
    @PostExchange(value = "/streams/{streamId}/products", contentType = MediaType.APPLICATION_JSON_VALUE)
    UploadResponse uploadReferencedData(@PathVariable(value = "streamId") String streamId,
                                        @RequestBody Map<String, String>... data);

}
