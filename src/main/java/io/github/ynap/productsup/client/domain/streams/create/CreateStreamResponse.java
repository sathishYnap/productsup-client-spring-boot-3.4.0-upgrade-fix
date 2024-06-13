package io.github.ynap.productsup.client.domain.streams.create;

import io.github.ynap.productsup.client.domain.streams.Stream;

/**
 * Create stream response.
 * @param data - Response data.
 */
public record CreateStreamResponse(Stream data) {
}
