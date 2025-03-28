/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Auto-generated code. Do not edit.

package com.google.genai.types;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.auto.value.AutoValue;
import com.google.genai.JsonSerializable;
import java.util.List;
import java.util.Optional;

/** Parameters for the embed_content method. */
@AutoValue
@JsonDeserialize(builder = EmbedContentParameters.Builder.class)
public abstract class EmbedContentParameters extends JsonSerializable {
  /**
   * ID of the model to use. For a list of models, see `Google models
   * <https://cloud.google.com/vertex-ai/generative-ai/docs/learn/models>`_.
   */
  @JsonProperty("model")
  public abstract Optional<String> model();

  /** The content to embed. Only the `parts.text` fields will be counted. */
  @JsonProperty("contents")
  public abstract Optional<List<Content>> contents();

  /** Configuration that contains optional parameters. */
  @JsonProperty("config")
  public abstract Optional<EmbedContentConfig> config();

  /** Instantiates a builder for EmbedContentParameters. */
  public static Builder builder() {
    return new AutoValue_EmbedContentParameters.Builder();
  }

  /** Creates a builder with the same values as this instance. */
  public abstract Builder toBuilder();

  /** Builder for EmbedContentParameters. */
  @AutoValue.Builder
  public abstract static class Builder {
    /** For internal usage. Please use `EmbedContentParameters.builder()` for instantiation. */
    @JsonCreator
    private static Builder create() {
      return new AutoValue_EmbedContentParameters.Builder();
    }

    @JsonProperty("model")
    public abstract Builder model(String model);

    @JsonProperty("contents")
    public abstract Builder contents(List<Content> contents);

    @JsonProperty("config")
    public abstract Builder config(EmbedContentConfig config);

    public abstract EmbedContentParameters build();
  }

  /** Deserializes a JSON string to a EmbedContentParameters object. */
  public static EmbedContentParameters fromJson(String jsonString) {
    return JsonSerializable.fromJsonString(jsonString, EmbedContentParameters.class);
  }
}
