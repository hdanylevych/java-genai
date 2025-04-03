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

package com.google.genai;

import com.google.api.core.BetaApi;
import com.google.genai.types.GenerateVideosOperation;
import com.google.genai.types.GetOperationConfig;
import java.util.concurrent.CompletableFuture;

public final class AsyncOperations {
  Operations operations;

  public AsyncOperations(ApiClient apiClient) {
    this.operations = new Operations(apiClient);
  }

  /**
   * Gets the status of a GenerateVideosOperation.
   *
   * @param operation A GenerateVideosOperation.
   * @param config The configuration for getting the operation.
   * @return A GenerateVideosOperation with the updated status of the operation.
   */
  @BetaApi
  public CompletableFuture<GenerateVideosOperation> getVideoOperation(
      GenerateVideosOperation operation, GetOperationConfig config) {
    return CompletableFuture.supplyAsync(() -> operations.getVideoOperation(operation, config));
  }
}
