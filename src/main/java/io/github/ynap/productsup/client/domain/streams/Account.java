package io.github.ynap.productsup.client.domain.streams;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Account information of where the stream belongs to.
 *
 * @param accountData - {@link AccountData}
 */
public record Account(@JsonProperty("data") AccountData accountData) {
}
