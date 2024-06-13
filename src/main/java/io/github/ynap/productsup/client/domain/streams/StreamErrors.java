package io.github.ynap.productsup.client.domain.streams;

import java.util.List;

/**
 * Stream errors.
 *
 * @param errors - List of {@link StreamError}
 */
public record StreamErrors(List<StreamError> errors) {
}
