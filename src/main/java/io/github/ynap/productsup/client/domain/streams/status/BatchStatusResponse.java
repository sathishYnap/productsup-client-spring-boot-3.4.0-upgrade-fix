package io.github.ynap.productsup.client.domain.streams.status;

import io.github.ynap.productsup.client.domain.streams.ResponseData;

/**
 * Batch status.
 *
 * @param data - {@link BatchStatusResponse}
 */
public record BatchStatusResponse(ResponseData data) {
}
