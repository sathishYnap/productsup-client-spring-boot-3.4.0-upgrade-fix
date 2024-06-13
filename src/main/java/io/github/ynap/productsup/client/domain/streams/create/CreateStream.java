package io.github.ynap.productsup.client.domain.streams.create;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ynap.productsup.client.domain.streams.Stream;

public record CreateStream(@JsonProperty("data") Stream data) {
}
