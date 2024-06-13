package io.github.ynap.productsup.client.domain.streams.upload;

import io.github.ynap.productsup.client.domain.streams.ResponseData;

/**
 * Upload products response.
 *
 * @param data - {@link ResponseData}
 */
public record UploadResponse(
        ResponseData data
) {
}
