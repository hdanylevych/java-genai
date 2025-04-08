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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.api.core.BetaApi;
import com.google.common.collect.ImmutableList;
import com.google.genai.errors.GenAiIOException;
import com.google.genai.types.Content;
import com.google.genai.types.EditImageConfig;
import com.google.genai.types.EditImageParameters;
import com.google.genai.types.EditImageResponse;
import com.google.genai.types.EmbedContentConfig;
import com.google.genai.types.EmbedContentParameters;
import com.google.genai.types.EmbedContentResponse;
import com.google.genai.types.GenerateContentConfig;
import com.google.genai.types.GenerateContentParameters;
import com.google.genai.types.GenerateContentResponse;
import com.google.genai.types.GenerateImagesConfig;
import com.google.genai.types.GenerateImagesParameters;
import com.google.genai.types.GenerateImagesResponse;
import com.google.genai.types.GenerateVideosConfig;
import com.google.genai.types.GenerateVideosOperation;
import com.google.genai.types.GenerateVideosParameters;
import com.google.genai.types.GeneratedImage;
import com.google.genai.types.Image;
import com.google.genai.types.Part;
import com.google.genai.types.ReferenceImage;
import com.google.genai.types.ReferenceImageAPI;
import com.google.genai.types.SafetyAttributes;
import com.google.genai.types.UpscaleImageAPIConfig;
import com.google.genai.types.UpscaleImageAPIParameters;
import com.google.genai.types.UpscaleImageConfig;
import com.google.genai.types.UpscaleImageResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

public final class Models {
  private final ApiClient apiClient;

  public Models(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"videoMetadata"}))) {
      throw new Error("videoMetadata parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SchemaToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"example"}))) {
      throw new Error("example parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"pattern"}))) {
      throw new Error("pattern parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"default"}))) {
      throw new Error("default parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"maxLength"}))) {
      throw new Error("maxLength parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"minLength"}))) {
      throw new Error("minLength parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"minProperties"}))) {
      throw new Error("minProperties parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"maxProperties"}))) {
      throw new Error("maxProperties parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"anyOf"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"anyOf"},
          Common.getValueByPath(fromObject, new String[] {"anyOf"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enum"},
          Common.getValueByPath(fromObject, new String[] {"enum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"format"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"format"},
          Common.getValueByPath(fromObject, new String[] {"format"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"items"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"items"},
          Common.getValueByPath(fromObject, new String[] {"items"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxItems"},
          Common.getValueByPath(fromObject, new String[] {"maxItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maximum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maximum"},
          Common.getValueByPath(fromObject, new String[] {"maximum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minItems"},
          Common.getValueByPath(fromObject, new String[] {"minItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minimum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minimum"},
          Common.getValueByPath(fromObject, new String[] {"minimum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"nullable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"nullable"},
          Common.getValueByPath(fromObject, new String[] {"nullable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"properties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"properties"},
          Common.getValueByPath(fromObject, new String[] {"properties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"propertyOrdering"},
          Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"required"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"required"},
          Common.getValueByPath(fromObject, new String[] {"required"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"type"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"type"},
          Common.getValueByPath(fromObject, new String[] {"type"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SafetySettingToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"method"}))) {
      throw new Error("method parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"category"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"category"},
          Common.getValueByPath(fromObject, new String[] {"category"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"threshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"threshold"},
          Common.getValueByPath(fromObject, new String[] {"threshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionDeclarationToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"response"}))) {
      throw new Error("response parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"parameters"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"parameters"},
          Common.getValueByPath(fromObject, new String[] {"parameters"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode DynamicRetrievalConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchRetrievalToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          DynamicRetrievalConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionDeclarationToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionDeclarations"}, result);
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"retrieval"}))) {
      throw new Error("retrieval parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          GoogleSearchToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          GoogleSearchRetrievalToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionCallingConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"allowedFunctionNames"},
          Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolConfigToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCallingConfig"},
          FunctionCallingConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PrebuiltVoiceConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"voiceName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"voiceName"},
          Common.getValueByPath(fromObject, new String[] {"voiceName"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode VoiceConfigToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"prebuiltVoiceConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prebuiltVoiceConfig"},
          PrebuiltVoiceConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"prebuiltVoiceConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SpeechConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"voiceConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"voiceConfig"},
          VoiceConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"voiceConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ThinkingConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"includeThoughts"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"includeThoughts"},
          Common.getValueByPath(fromObject, new String[] {"includeThoughts"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thinkingBudget"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thinkingBudget"},
          Common.getValueByPath(fromObject, new String[] {"thinkingBudget"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"systemInstruction"},
          ContentToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidateCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"candidateCount"},
          Common.getValueByPath(fromObject, new String[] {"candidateCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"stopSequences"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"stopSequences"},
          Common.getValueByPath(fromObject, new String[] {"stopSequences"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseLogprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseLogprobs"},
          Common.getValueByPath(fromObject, new String[] {"responseLogprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"logprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"logprobs"},
          Common.getValueByPath(fromObject, new String[] {"logprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"presencePenalty"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"presencePenalty"},
          Common.getValueByPath(fromObject, new String[] {"presencePenalty"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"frequencyPenalty"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"frequencyPenalty"},
          Common.getValueByPath(fromObject, new String[] {"frequencyPenalty"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseMimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseMimeType"},
          Common.getValueByPath(fromObject, new String[] {"responseMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseSchema"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseSchema"},
          SchemaToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tSchema(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"responseSchema"}))),
              toObject));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"routingConfig"}))) {
      throw new Error("routingConfig parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(
        Common.getValueByPath(fromObject, new String[] {"generateContentModelConfig"}))) {
      throw new Error("generateContentModelConfig parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetySettings"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"safetySettings"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                SafetySettingToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"safetySettings"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToMldev(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"toolConfig"},
          ToolConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolConfig"})),
              toObject));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"labels"}))) {
      throw new Error("labels parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContent"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"cachedContent"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"cachedContent"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"speechConfig"},
          SpeechConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tSpeechConfig(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"speechConfig"}))),
              toObject));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"audioTimestamp"}))) {
      throw new Error("audioTimestamp parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"thinkingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thinkingConfig"},
          ThinkingConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"thinkingConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"contents"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(ContentToMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"contents"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          GenerateContentConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"taskType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"requests[]", "taskType"},
          Common.getValueByPath(fromObject, new String[] {"taskType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"requests[]", "title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputDimensionality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"requests[]", "outputDimensionality"},
          Common.getValueByPath(fromObject, new String[] {"outputDimensionality"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"mimeType"}))) {
      throw new Error("mimeType parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"autoTruncate"}))) {
      throw new Error("autoTruncate parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"requests[]", "content"},
          Transformers.tContentsForEmbed(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"contents"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          EmbedContentConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    Common.setValueByPath(
        toObject,
        new String[] {"requests[]", "model"},
        Transformers.tModel(
            this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}))) {
      throw new Error("outputGcsUri parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"negativePrompt"}))) {
      throw new Error("negativePrompt parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"numberOfImages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfImages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"aspectRatio"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "aspectRatio"},
          Common.getValueByPath(fromObject, new String[] {"aspectRatio"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"guidanceScale"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "guidanceScale"},
          Common.getValueByPath(fromObject, new String[] {"guidanceScale"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"seed"}))) {
      throw new Error("seed parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "safetySetting"},
          Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"personGeneration"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "personGeneration"},
          Common.getValueByPath(fromObject, new String[] {"personGeneration"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeSafetyAttributes"},
          Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeRaiReason"},
          Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"language"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "language"},
          Common.getValueByPath(fromObject, new String[] {"language"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputMimeType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "mimeType"},
          Common.getValueByPath(fromObject, new String[] {"outputMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "compressionQuality"},
          Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"addWatermark"}))) {
      throw new Error("addWatermark parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}))) {
      throw new Error("enhancePrompt parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "prompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          GenerateImagesConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ImageToMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"gcsUri"}))) {
      throw new Error("gcsUri parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"imageBytes"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"bytesBase64Encoded"},
          Transformers.tBytes(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"imageBytes"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosConfigToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"numberOfVideos"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfVideos"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}))) {
      throw new Error("outputGcsUri parameter is not supported in Gemini API.");
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"fps"}))) {
      throw new Error("fps parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"durationSeconds"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "durationSeconds"},
          Common.getValueByPath(fromObject, new String[] {"durationSeconds"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"seed"}))) {
      throw new Error("seed parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"aspectRatio"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "aspectRatio"},
          Common.getValueByPath(fromObject, new String[] {"aspectRatio"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"resolution"}))) {
      throw new Error("resolution parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"personGeneration"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "personGeneration"},
          Common.getValueByPath(fromObject, new String[] {"personGeneration"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"pubsubTopic"}))) {
      throw new Error("pubsubTopic parameter is not supported in Gemini API.");
    }

    if (Common.getValueByPath(fromObject, new String[] {"negativePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "negativePrompt"},
          Common.getValueByPath(fromObject, new String[] {"negativePrompt"}));
    }

    if (!Common.isZero(Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}))) {
      throw new Error("enhancePrompt parameter is not supported in Gemini API.");
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosParametersToMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "prompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"image"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "image"},
          ImageToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"image"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          GenerateVideosConfigToMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SchemaToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"example"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"example"},
          Common.getValueByPath(fromObject, new String[] {"example"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pattern"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"pattern"},
          Common.getValueByPath(fromObject, new String[] {"pattern"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"default"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"default"},
          Common.getValueByPath(fromObject, new String[] {"default"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxLength"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxLength"},
          Common.getValueByPath(fromObject, new String[] {"maxLength"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minLength"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minLength"},
          Common.getValueByPath(fromObject, new String[] {"minLength"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minProperties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minProperties"},
          Common.getValueByPath(fromObject, new String[] {"minProperties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxProperties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxProperties"},
          Common.getValueByPath(fromObject, new String[] {"maxProperties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"anyOf"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"anyOf"},
          Common.getValueByPath(fromObject, new String[] {"anyOf"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enum"},
          Common.getValueByPath(fromObject, new String[] {"enum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"format"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"format"},
          Common.getValueByPath(fromObject, new String[] {"format"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"items"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"items"},
          Common.getValueByPath(fromObject, new String[] {"items"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxItems"},
          Common.getValueByPath(fromObject, new String[] {"maxItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maximum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maximum"},
          Common.getValueByPath(fromObject, new String[] {"maximum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minItems"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minItems"},
          Common.getValueByPath(fromObject, new String[] {"minItems"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"minimum"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"minimum"},
          Common.getValueByPath(fromObject, new String[] {"minimum"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"nullable"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"nullable"},
          Common.getValueByPath(fromObject, new String[] {"nullable"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"properties"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"properties"},
          Common.getValueByPath(fromObject, new String[] {"properties"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"propertyOrdering"},
          Common.getValueByPath(fromObject, new String[] {"propertyOrdering"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"required"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"required"},
          Common.getValueByPath(fromObject, new String[] {"required"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"type"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"type"},
          Common.getValueByPath(fromObject, new String[] {"type"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SafetySettingToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"method"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"method"},
          Common.getValueByPath(fromObject, new String[] {"method"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"category"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"category"},
          Common.getValueByPath(fromObject, new String[] {"category"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"threshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"threshold"},
          Common.getValueByPath(fromObject, new String[] {"threshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionDeclarationToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          SchemaToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"description"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"description"},
          Common.getValueByPath(fromObject, new String[] {"description"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"parameters"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"parameters"},
          Common.getValueByPath(fromObject, new String[] {"parameters"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode DynamicRetrievalConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicThreshold"},
          Common.getValueByPath(fromObject, new String[] {"dynamicThreshold"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GoogleSearchRetrievalToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dynamicRetrievalConfig"},
          DynamicRetrievalConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"dynamicRetrievalConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionDeclarations"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"functionDeclarations"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                FunctionDeclarationToVertex(
                    apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"functionDeclarations"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"retrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"retrieval"},
          Common.getValueByPath(fromObject, new String[] {"retrieval"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearch"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearch"},
          GoogleSearchToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearch"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"googleSearchRetrieval"},
          GoogleSearchRetrievalToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"googleSearchRetrieval"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecution"},
          Common.getValueByPath(fromObject, new String[] {"codeExecution"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode FunctionCallingConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"allowedFunctionNames"},
          Common.getValueByPath(fromObject, new String[] {"allowedFunctionNames"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ToolConfigToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCallingConfig"},
          FunctionCallingConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"functionCallingConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PrebuiltVoiceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"voiceName"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"voiceName"},
          Common.getValueByPath(fromObject, new String[] {"voiceName"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode VoiceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"prebuiltVoiceConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"prebuiltVoiceConfig"},
          PrebuiltVoiceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"prebuiltVoiceConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SpeechConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"voiceConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"voiceConfig"},
          VoiceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"voiceConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ThinkingConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"includeThoughts"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"includeThoughts"},
          Common.getValueByPath(fromObject, new String[] {"includeThoughts"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thinkingBudget"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thinkingBudget"},
          Common.getValueByPath(fromObject, new String[] {"thinkingBudget"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"systemInstruction"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"systemInstruction"},
          ContentToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tContent(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"systemInstruction"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"temperature"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"temperature"},
          Common.getValueByPath(fromObject, new String[] {"temperature"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topP"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"topP"},
          Common.getValueByPath(fromObject, new String[] {"topP"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"topK"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"topK"},
          Common.getValueByPath(fromObject, new String[] {"topK"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"candidateCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"candidateCount"},
          Common.getValueByPath(fromObject, new String[] {"candidateCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maxOutputTokens"},
          Common.getValueByPath(fromObject, new String[] {"maxOutputTokens"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"stopSequences"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"stopSequences"},
          Common.getValueByPath(fromObject, new String[] {"stopSequences"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseLogprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseLogprobs"},
          Common.getValueByPath(fromObject, new String[] {"responseLogprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"logprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"logprobs"},
          Common.getValueByPath(fromObject, new String[] {"logprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"presencePenalty"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"presencePenalty"},
          Common.getValueByPath(fromObject, new String[] {"presencePenalty"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"frequencyPenalty"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"frequencyPenalty"},
          Common.getValueByPath(fromObject, new String[] {"frequencyPenalty"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseMimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseMimeType"},
          Common.getValueByPath(fromObject, new String[] {"responseMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseSchema"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseSchema"},
          SchemaToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tSchema(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"responseSchema"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"routingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"routingConfig"},
          Common.getValueByPath(fromObject, new String[] {"routingConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"generateContentModelConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelConfig"},
          Common.getValueByPath(fromObject, new String[] {"generateContentModelConfig"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetySettings"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"safetySettings"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                SafetySettingToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"safetySettings"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"tools"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"tools"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ToolToVertex(
                    apiClient,
                    JsonSerializable.toJsonNode(Transformers.tTool(this.apiClient, item)),
                    toObject));
          });
      Common.setValueByPath(parentObject, new String[] {"tools"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"toolConfig"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"toolConfig"},
          ToolConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"toolConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"labels"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"labels"},
          Common.getValueByPath(fromObject, new String[] {"labels"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"cachedContent"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"cachedContent"},
          Transformers.tCachedContentName(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"cachedContent"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseModalities"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseModalities"},
          Common.getValueByPath(fromObject, new String[] {"responseModalities"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mediaResolution"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mediaResolution"},
          Common.getValueByPath(fromObject, new String[] {"mediaResolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"speechConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"speechConfig"},
          SpeechConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Transformers.tSpeechConfig(
                      this.apiClient,
                      Common.getValueByPath(fromObject, new String[] {"speechConfig"}))),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"audioTimestamp"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"audioTimestamp"},
          Common.getValueByPath(fromObject, new String[] {"audioTimestamp"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thinkingConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thinkingConfig"},
          ThinkingConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"thinkingConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"contents"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(ContentToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"contents"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"generationConfig"},
          GenerateContentConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"taskType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"instances[]", "task_type"},
          Common.getValueByPath(fromObject, new String[] {"taskType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"title"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"instances[]", "title"},
          Common.getValueByPath(fromObject, new String[] {"title"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputDimensionality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputDimensionality"},
          Common.getValueByPath(fromObject, new String[] {"outputDimensionality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"instances[]", "mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"autoTruncate"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "autoTruncate"},
          Common.getValueByPath(fromObject, new String[] {"autoTruncate"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contents"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[]", "content"},
          Transformers.tContentsForEmbed(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"contents"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          EmbedContentConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "storageUri"},
          Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"negativePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "negativePrompt"},
          Common.getValueByPath(fromObject, new String[] {"negativePrompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"numberOfImages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfImages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"aspectRatio"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "aspectRatio"},
          Common.getValueByPath(fromObject, new String[] {"aspectRatio"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"guidanceScale"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "guidanceScale"},
          Common.getValueByPath(fromObject, new String[] {"guidanceScale"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "safetySetting"},
          Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"personGeneration"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "personGeneration"},
          Common.getValueByPath(fromObject, new String[] {"personGeneration"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeSafetyAttributes"},
          Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeRaiReason"},
          Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"language"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "language"},
          Common.getValueByPath(fromObject, new String[] {"language"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputMimeType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "mimeType"},
          Common.getValueByPath(fromObject, new String[] {"outputMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "compressionQuality"},
          Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"addWatermark"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "addWatermark"},
          Common.getValueByPath(fromObject, new String[] {"addWatermark"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "enhancePrompt"},
          Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "prompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          GenerateImagesConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ImageToVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"gcsUri"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"gcsUri"},
          Common.getValueByPath(fromObject, new String[] {"gcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"imageBytes"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"bytesBase64Encoded"},
          Transformers.tBytes(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"imageBytes"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode MaskReferenceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"maskMode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maskMode"},
          Common.getValueByPath(fromObject, new String[] {"maskMode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"segmentationClasses"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maskClasses"},
          Common.getValueByPath(fromObject, new String[] {"segmentationClasses"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maskDilation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"dilation"},
          Common.getValueByPath(fromObject, new String[] {"maskDilation"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ControlReferenceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"controlType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"controlType"},
          Common.getValueByPath(fromObject, new String[] {"controlType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enableControlImageComputation"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"computeControl"},
          Common.getValueByPath(fromObject, new String[] {"enableControlImageComputation"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode StyleReferenceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"styleDescription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"styleDescription"},
          Common.getValueByPath(fromObject, new String[] {"styleDescription"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SubjectReferenceConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"subjectType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"subjectType"},
          Common.getValueByPath(fromObject, new String[] {"subjectType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"subjectDescription"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"subjectDescription"},
          Common.getValueByPath(fromObject, new String[] {"subjectDescription"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ReferenceImageAPIToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"referenceImage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"referenceImage"},
          ImageToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"referenceImage"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"referenceId"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"referenceId"},
          Common.getValueByPath(fromObject, new String[] {"referenceId"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"referenceType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"referenceType"},
          Common.getValueByPath(fromObject, new String[] {"referenceType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"maskImageConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"maskImageConfig"},
          MaskReferenceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"maskImageConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"controlImageConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"controlImageConfig"},
          ControlReferenceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"controlImageConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"styleImageConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"styleImageConfig"},
          StyleReferenceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"styleImageConfig"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"subjectImageConfig"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"subjectImageConfig"},
          SubjectReferenceConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"subjectImageConfig"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EditImageConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "storageUri"},
          Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"negativePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "negativePrompt"},
          Common.getValueByPath(fromObject, new String[] {"negativePrompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"numberOfImages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfImages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"aspectRatio"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "aspectRatio"},
          Common.getValueByPath(fromObject, new String[] {"aspectRatio"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"guidanceScale"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "guidanceScale"},
          Common.getValueByPath(fromObject, new String[] {"guidanceScale"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "safetySetting"},
          Common.getValueByPath(fromObject, new String[] {"safetyFilterLevel"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"personGeneration"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "personGeneration"},
          Common.getValueByPath(fromObject, new String[] {"personGeneration"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeSafetyAttributes"},
          Common.getValueByPath(fromObject, new String[] {"includeSafetyAttributes"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeRaiReason"},
          Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"language"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "language"},
          Common.getValueByPath(fromObject, new String[] {"language"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputMimeType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "mimeType"},
          Common.getValueByPath(fromObject, new String[] {"outputMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "compressionQuality"},
          Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"editMode"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "editMode"},
          Common.getValueByPath(fromObject, new String[] {"editMode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"baseSteps"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "editConfig", "baseSteps"},
          Common.getValueByPath(fromObject, new String[] {"baseSteps"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EditImageParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "prompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"referenceImages"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"referenceImages"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ReferenceImageAPIToVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"instances[0]", "referenceImages"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          EditImageConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode UpscaleImageAPIConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "includeRaiReason"},
          Common.getValueByPath(fromObject, new String[] {"includeRaiReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputMimeType"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "mimeType"},
          Common.getValueByPath(fromObject, new String[] {"outputMimeType"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "outputOptions", "compressionQuality"},
          Common.getValueByPath(fromObject, new String[] {"outputCompressionQuality"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"numberOfImages"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfImages"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mode"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "mode"},
          Common.getValueByPath(fromObject, new String[] {"mode"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode UpscaleImageAPIParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"image"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "image"},
          ImageToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"image"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"upscaleFactor"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"parameters", "upscaleConfig", "upscaleFactor"},
          Common.getValueByPath(fromObject, new String[] {"upscaleFactor"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          UpscaleImageAPIConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosConfigToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"numberOfVideos"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "sampleCount"},
          Common.getValueByPath(fromObject, new String[] {"numberOfVideos"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "storageUri"},
          Common.getValueByPath(fromObject, new String[] {"outputGcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fps"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "fps"},
          Common.getValueByPath(fromObject, new String[] {"fps"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"durationSeconds"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "durationSeconds"},
          Common.getValueByPath(fromObject, new String[] {"durationSeconds"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"seed"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "seed"},
          Common.getValueByPath(fromObject, new String[] {"seed"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"aspectRatio"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "aspectRatio"},
          Common.getValueByPath(fromObject, new String[] {"aspectRatio"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"resolution"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "resolution"},
          Common.getValueByPath(fromObject, new String[] {"resolution"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"personGeneration"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "personGeneration"},
          Common.getValueByPath(fromObject, new String[] {"personGeneration"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"pubsubTopic"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "pubsubTopic"},
          Common.getValueByPath(fromObject, new String[] {"pubsubTopic"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"negativePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "negativePrompt"},
          Common.getValueByPath(fromObject, new String[] {"negativePrompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}) != null) {
      Common.setValueByPath(
          parentObject,
          new String[] {"parameters", "enhancePrompt"},
          Common.getValueByPath(fromObject, new String[] {"enhancePrompt"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosParametersToVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"model"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"_url", "model"},
          Transformers.tModel(
              this.apiClient, Common.getValueByPath(fromObject, new String[] {"model"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "prompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"image"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"instances[0]", "image"},
          ImageToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"image"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"config"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"config"},
          GenerateVideosConfigToVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"config"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode CitationMetadataFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"citationSources"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"citations"},
          Common.getValueByPath(fromObject, new String[] {"citationSources"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode CandidateFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"content"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"content"},
          ContentFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"content"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"citationMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"citationMetadata"},
          CitationMetadataFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"citationMetadata"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"tokenCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"tokenCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finishReason"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finishReason"},
          Common.getValueByPath(fromObject, new String[] {"finishReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"avgLogprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"avgLogprobs"},
          Common.getValueByPath(fromObject, new String[] {"avgLogprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"groundingMetadata"},
          Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"index"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"index"},
          Common.getValueByPath(fromObject, new String[] {"index"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"logprobsResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"logprobsResult"},
          Common.getValueByPath(fromObject, new String[] {"logprobsResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyRatings"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"safetyRatings"},
          Common.getValueByPath(fromObject, new String[] {"safetyRatings"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentResponseFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"candidates"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"candidates"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(CandidateFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"candidates"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"modelVersion"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelVersion"},
          Common.getValueByPath(fromObject, new String[] {"modelVersion"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptFeedback"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptFeedback"},
          Common.getValueByPath(fromObject, new String[] {"promptFeedback"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          Common.getValueByPath(fromObject, new String[] {"usageMetadata"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentEmbeddingStatisticsFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentEmbeddingFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"values"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"values"},
          Common.getValueByPath(fromObject, new String[] {"values"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentMetadataFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentResponseFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"embeddings"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"embeddings"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ContentEmbeddingFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"embeddings"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          EmbedContentMetadataFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"metadata"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ImageFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();

    if (Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"imageBytes"},
          Transformers.tBytes(
              this.apiClient,
              Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SafetyAttributesFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "categories"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"categories"},
          Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "categories"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "scores"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scores"},
          Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "scores"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contentType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"contentType"},
          Common.getValueByPath(fromObject, new String[] {"contentType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GeneratedImageFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"image"},
          ImageFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiFilteredReason"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiFilteredReason"},
          Common.getValueByPath(fromObject, new String[] {"raiFilteredReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"safetyAttributes"},
          SafetyAttributesFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesResponseFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"predictions"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"predictions"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedImageFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedImages"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"positivePromptSafetyAttributes"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"positivePromptSafetyAttributes"},
          SafetyAttributesFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(
                      fromObject, new String[] {"positivePromptSafetyAttributes"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode VideoFromMldev(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"video", "uri"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"uri"},
          Common.getValueByPath(fromObject, new String[] {"video", "uri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"video", "encodedVideo"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoBytes"},
          Transformers.tBytes(
              this.apiClient,
              Common.getValueByPath(fromObject, new String[] {"video", "encodedVideo"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"encoding"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"encoding"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GeneratedVideoFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"video"},
          VideoFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosResponseFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"generatedSamples"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"generatedSamples"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedVideoFromMldev(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedVideos"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiMediaFilteredCount"},
          Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredReasons"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiMediaFilteredReasons"},
          Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredReasons"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosOperationFromMldev(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"done"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"done"},
          Common.getValueByPath(fromObject, new String[] {"done"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"error"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"error"},
          Common.getValueByPath(fromObject, new String[] {"error"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response", "generateVideoResponse"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          GenerateVideosResponseFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(
                      fromObject, new String[] {"response", "generateVideoResponse"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response", "generateVideoResponse"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"result"},
          GenerateVideosResponseFromMldev(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(
                      fromObject, new String[] {"response", "generateVideoResponse"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode PartFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videoMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoMetadata"},
          Common.getValueByPath(fromObject, new String[] {"videoMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"thought"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"thought"},
          Common.getValueByPath(fromObject, new String[] {"thought"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"codeExecutionResult"},
          Common.getValueByPath(fromObject, new String[] {"codeExecutionResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"executableCode"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"executableCode"},
          Common.getValueByPath(fromObject, new String[] {"executableCode"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"fileData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"fileData"},
          Common.getValueByPath(fromObject, new String[] {"fileData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionCall"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionCall"},
          Common.getValueByPath(fromObject, new String[] {"functionCall"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"functionResponse"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"functionResponse"},
          Common.getValueByPath(fromObject, new String[] {"functionResponse"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"inlineData"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"inlineData"},
          Common.getValueByPath(fromObject, new String[] {"inlineData"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"text"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"text"},
          Common.getValueByPath(fromObject, new String[] {"text"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"parts"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"parts"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(PartFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"parts"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"role"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"role"},
          Common.getValueByPath(fromObject, new String[] {"role"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode CitationMetadataFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"citations"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"citations"},
          Common.getValueByPath(fromObject, new String[] {"citations"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode CandidateFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"content"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"content"},
          ContentFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"content"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"citationMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"citationMetadata"},
          CitationMetadataFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"citationMetadata"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finishMessage"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finishMessage"},
          Common.getValueByPath(fromObject, new String[] {"finishMessage"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"finishReason"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"finishReason"},
          Common.getValueByPath(fromObject, new String[] {"finishReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"avgLogprobs"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"avgLogprobs"},
          Common.getValueByPath(fromObject, new String[] {"avgLogprobs"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"groundingMetadata"},
          Common.getValueByPath(fromObject, new String[] {"groundingMetadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"index"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"index"},
          Common.getValueByPath(fromObject, new String[] {"index"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"logprobsResult"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"logprobsResult"},
          Common.getValueByPath(fromObject, new String[] {"logprobsResult"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyRatings"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"safetyRatings"},
          Common.getValueByPath(fromObject, new String[] {"safetyRatings"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateContentResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"candidates"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"candidates"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(CandidateFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"candidates"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"createTime"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"createTime"},
          Common.getValueByPath(fromObject, new String[] {"createTime"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"responseId"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"responseId"},
          Common.getValueByPath(fromObject, new String[] {"responseId"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"modelVersion"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"modelVersion"},
          Common.getValueByPath(fromObject, new String[] {"modelVersion"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"promptFeedback"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"promptFeedback"},
          Common.getValueByPath(fromObject, new String[] {"promptFeedback"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"usageMetadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"usageMetadata"},
          Common.getValueByPath(fromObject, new String[] {"usageMetadata"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentEmbeddingStatisticsFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"truncated"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"truncated"},
          Common.getValueByPath(fromObject, new String[] {"truncated"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"token_count"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"tokenCount"},
          Common.getValueByPath(fromObject, new String[] {"token_count"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ContentEmbeddingFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"values"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"values"},
          Common.getValueByPath(fromObject, new String[] {"values"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"statistics"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"statistics"},
          ContentEmbeddingStatisticsFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"statistics"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentMetadataFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"billableCharacterCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"billableCharacterCount"},
          Common.getValueByPath(fromObject, new String[] {"billableCharacterCount"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EmbedContentResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"predictions[]", "embeddings"}) != null) {
      ArrayNode keyArray =
          (ArrayNode)
              Common.getValueByPath(fromObject, new String[] {"predictions[]", "embeddings"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                ContentEmbeddingFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"embeddings"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          EmbedContentMetadataFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"metadata"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode ImageFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"gcsUri"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"gcsUri"},
          Common.getValueByPath(fromObject, new String[] {"gcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"imageBytes"},
          Transformers.tBytes(
              this.apiClient,
              Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode SafetyAttributesFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "categories"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"categories"},
          Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "categories"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "scores"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"scores"},
          Common.getValueByPath(fromObject, new String[] {"safetyAttributes", "scores"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"contentType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"contentType"},
          Common.getValueByPath(fromObject, new String[] {"contentType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GeneratedImageFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"image"},
          ImageFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiFilteredReason"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiFilteredReason"},
          Common.getValueByPath(fromObject, new String[] {"raiFilteredReason"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"safetyAttributes"},
          SafetyAttributesFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"prompt"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"enhancedPrompt"},
          Common.getValueByPath(fromObject, new String[] {"prompt"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateImagesResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"predictions"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"predictions"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedImageFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedImages"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"positivePromptSafetyAttributes"})
        != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"positivePromptSafetyAttributes"},
          SafetyAttributesFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(
                      fromObject, new String[] {"positivePromptSafetyAttributes"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode EditImageResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"predictions"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"predictions"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedImageFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedImages"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode UpscaleImageResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"predictions"}) != null) {
      ArrayNode keyArray =
          (ArrayNode) Common.getValueByPath(fromObject, new String[] {"predictions"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedImageFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedImages"}, result);
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode VideoFromVertex(ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"gcsUri"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"uri"},
          Common.getValueByPath(fromObject, new String[] {"gcsUri"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"videoBytes"},
          Transformers.tBytes(
              this.apiClient,
              Common.getValueByPath(fromObject, new String[] {"bytesBase64Encoded"})));
    }

    if (Common.getValueByPath(fromObject, new String[] {"mimeType"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"mimeType"},
          Common.getValueByPath(fromObject, new String[] {"mimeType"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GeneratedVideoFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"_self"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"video"},
          VideoFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"_self"})),
              toObject));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosResponseFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"videos"}) != null) {
      ArrayNode keyArray = (ArrayNode) Common.getValueByPath(fromObject, new String[] {"videos"});
      ObjectMapper objectMapper = new ObjectMapper();
      ArrayNode result = objectMapper.createArrayNode();

      keyArray.forEach(
          item -> {
            result.add(
                GeneratedVideoFromVertex(apiClient, JsonSerializable.toJsonNode(item), toObject));
          });
      Common.setValueByPath(toObject, new String[] {"generatedVideos"}, result);
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredCount"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiMediaFilteredCount"},
          Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredCount"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredReasons"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"raiMediaFilteredReasons"},
          Common.getValueByPath(fromObject, new String[] {"raiMediaFilteredReasons"}));
    }

    return toObject;
  }

  @ExcludeFromGeneratedCoverageReport
  ObjectNode GenerateVideosOperationFromVertex(
      ApiClient apiClient, JsonNode fromObject, ObjectNode parentObject) {
    ObjectNode toObject = JsonSerializable.objectMapper.createObjectNode();
    if (Common.getValueByPath(fromObject, new String[] {"name"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"name"},
          Common.getValueByPath(fromObject, new String[] {"name"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"metadata"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"metadata"},
          Common.getValueByPath(fromObject, new String[] {"metadata"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"done"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"done"},
          Common.getValueByPath(fromObject, new String[] {"done"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"error"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"error"},
          Common.getValueByPath(fromObject, new String[] {"error"}));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"response"},
          GenerateVideosResponseFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    if (Common.getValueByPath(fromObject, new String[] {"response"}) != null) {
      Common.setValueByPath(
          toObject,
          new String[] {"result"},
          GenerateVideosResponseFromVertex(
              apiClient,
              JsonSerializable.toJsonNode(
                  Common.getValueByPath(fromObject, new String[] {"response"})),
              toObject));
    }

    return toObject;
  }

  private GenerateContentResponse privateGenerateContent(
      String model, List<Content> contents, GenerateContentConfig config) {

    GenerateContentParameters.Builder parameterBuilder = GenerateContentParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(contents)) {
      parameterBuilder.contents(contents);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = GenerateContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:generateContent", body.get("_url"));
    } else {
      body = GenerateContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:generateContent", body.get("_url"));
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = GenerateContentResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = GenerateContentResponseFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, GenerateContentResponse.class);
    }
  }

  private ResponseStream<GenerateContentResponse> privateGenerateContentStream(
      String model, List<Content> contents, GenerateContentConfig config) {

    GenerateContentParameters.Builder parameterBuilder = GenerateContentParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(contents)) {
      parameterBuilder.contents(contents);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = GenerateContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:streamGenerateContent?alt=sse", body.get("_url"));
    } else {
      body = GenerateContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:streamGenerateContent?alt=sse", body.get("_url"));
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body));
    String converterName;
    if (this.apiClient.vertexAI()) {
      converterName = "GenerateContentResponseFromVertex";
    } else {
      converterName = "GenerateContentResponseFromMldev";
    }
    return new ResponseStream<GenerateContentResponse>(
        GenerateContentResponse.class, response, this, converterName);
  }

  private EmbedContentResponse privateEmbedContent(
      String model, List<Content> contents, EmbedContentConfig config) {

    EmbedContentParameters.Builder parameterBuilder = EmbedContentParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(contents)) {
      parameterBuilder.contents(contents);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = EmbedContentParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predict", body.get("_url"));
    } else {
      body = EmbedContentParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:batchEmbedContents", body.get("_url"));
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = EmbedContentResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = EmbedContentResponseFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, EmbedContentResponse.class);
    }
  }

  private GenerateImagesResponse privateGenerateImages(
      String model, String prompt, GenerateImagesConfig config) {

    GenerateImagesParameters.Builder parameterBuilder = GenerateImagesParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(prompt)) {
      parameterBuilder.prompt(prompt);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = GenerateImagesParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predict", body.get("_url"));
    } else {
      body = GenerateImagesParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predict", body.get("_url"));
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = GenerateImagesResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = GenerateImagesResponseFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, GenerateImagesResponse.class);
    }
  }

  private EditImageResponse privateEditImage(
      String model,
      String prompt,
      List<ReferenceImageAPI> referenceImages,
      EditImageConfig config) {

    EditImageParameters.Builder parameterBuilder = EditImageParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(prompt)) {
      parameterBuilder.prompt(prompt);
    }
    if (!Common.isZero(referenceImages)) {
      parameterBuilder.referenceImages(referenceImages);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = EditImageParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predict", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported by the Gemini Developer API.");
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = EditImageResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        throw new UnsupportedOperationException(
            "This method is only supported by the Gemini Developer API.");
      }
      return JsonSerializable.fromJsonNode(responseNode, EditImageResponse.class);
    }
  }

  private UpscaleImageResponse privateUpscaleImage(
      String model, Image image, String upscaleFactor, UpscaleImageAPIConfig config) {

    UpscaleImageAPIParameters.Builder parameterBuilder = UpscaleImageAPIParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(image)) {
      parameterBuilder.image(image);
    }
    if (!Common.isZero(upscaleFactor)) {
      parameterBuilder.upscaleFactor(upscaleFactor);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = UpscaleImageAPIParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predict", body.get("_url"));
    } else {
      throw new UnsupportedOperationException(
          "This method is only supported by the Gemini Developer API.");
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = UpscaleImageResponseFromVertex(this.apiClient, responseNode, null);
      } else {
        throw new UnsupportedOperationException(
            "This method is only supported by the Gemini Developer API.");
      }
      return JsonSerializable.fromJsonNode(responseNode, UpscaleImageResponse.class);
    }
  }

  @BetaApi
  public GenerateVideosOperation generateVideos(
      String model, String prompt, Image image, GenerateVideosConfig config) {

    GenerateVideosParameters.Builder parameterBuilder = GenerateVideosParameters.builder();

    if (!Common.isZero(model)) {
      parameterBuilder.model(model);
    }
    if (!Common.isZero(prompt)) {
      parameterBuilder.prompt(prompt);
    }
    if (!Common.isZero(image)) {
      parameterBuilder.image(image);
    }
    if (!Common.isZero(config)) {
      parameterBuilder.config(config);
    }
    JsonNode parameterNode = JsonSerializable.toJsonNode(parameterBuilder.build());

    ObjectNode body;
    String path;
    if (this.apiClient.vertexAI()) {
      body = GenerateVideosParametersToVertex(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predictLongRunning", body.get("_url"));
    } else {
      body = GenerateVideosParametersToMldev(this.apiClient, parameterNode, null);
      path = Common.formatMap("{model}:predictLongRunning", body.get("_url"));
    }
    body.remove("_url");
    // TODO: Remove the hack that removes config.
    body.remove("config");

    try (ApiResponse response = this.apiClient.post(path, JsonSerializable.toJsonString(body))) {
      HttpEntity entity = response.getEntity();
      String responseString;
      try {
        responseString = EntityUtils.toString(entity);
      } catch (IOException e) {
        throw new GenAiIOException("Failed to read HTTP response.", e);
      }
      JsonNode responseNode = JsonSerializable.stringToJsonNode(responseString);
      if (this.apiClient.vertexAI()) {
        responseNode = GenerateVideosOperationFromVertex(this.apiClient, responseNode, null);
      } else {
        responseNode = GenerateVideosOperationFromMldev(this.apiClient, responseNode, null);
      }
      return JsonSerializable.fromJsonNode(responseNode, GenerateVideosOperation.class);
    }
  }

  /**
   * Generates content given a GenAI model and a content object.
   *
   * @param model the name of the GenAI model to use for generation
   * @param contents a {@link List<com.google.genai.types.Content>} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public GenerateContentResponse generateContent(
      String model, List<Content> contents, GenerateContentConfig config) {
    return privateGenerateContent(model, contents, config);
  }

  /**
   * Generates content given a GenAI model and a content object.
   *
   * @param model the name of the GenAI model to use for generation
   * @param content a {@link com.google.genai.types.Content} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public GenerateContentResponse generateContent(
      String model, Content content, GenerateContentConfig config) {
    return privateGenerateContent(
        model, Transformers.tContents(this.apiClient, (Object) content), config);
  }

  /**
   * Generates content given a GenAI model and a text string.
   *
   * @param model the name of the GenAI model to use for generation
   * @param text the text string to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public GenerateContentResponse generateContent(
      String model, String text, GenerateContentConfig config) {
    return privateGenerateContent(
        model, Transformers.tContents(this.apiClient, (Object) text), config);
  }

  /**
   * Generates content with streaming support given a GenAI model and a content object.
   *
   * @param model the name of the GenAI model to use for generation
   * @param contents a {@link List<com.google.genai.types.Content>} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public ResponseStream<GenerateContentResponse> generateContentStream(
      String model, List<Content> contents, GenerateContentConfig config) {
    return privateGenerateContentStream(model, contents, config);
  }

  /**
   * Generates content with streaming support given a GenAI model and a content object.
   *
   * @param model the name of the GenAI model to use for generation
   * @param content a {@link com.google.genai.types.Content} to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public ResponseStream<GenerateContentResponse> generateContentStream(
      String model, Content content, GenerateContentConfig config) {
    return privateGenerateContentStream(
        model, Transformers.tContents(this.apiClient, (Object) content), config);
  }

  /**
   * Generates content with streaming support given a GenAI model and a text string.
   *
   * @param model the name of the GenAI model to use for generation
   * @param text the text string to send to the generative model
   * @param config a {@link com.google.genai.types.GenerateContentConfig} instance that specifies
   *     the optional configurations
   * @return a {@link com.google.genai.types.GenerateContentResponse} instance that contains
   *     response contents and other metadata
   */
  public ResponseStream<GenerateContentResponse> generateContentStream(
      String model, String text, GenerateContentConfig config) {
    return privateGenerateContentStream(
        model, Transformers.tContents(this.apiClient, (Object) text), config);
  }

  /**
   * Generates images given a GenAI model and a prompt.
   *
   * @param model the name of the GenAI model to use for upscaling
   * @param prompt the factor to upscale the image
   * @param config a {@link com.google.genai.types.GenerateImagesConfig} instance that specifies the
   *     optional configurations
   * @return a {@link com.google.genai.types.GenerateImagesResponse} instance that contains the
   *     generated images.
   */
  public GenerateImagesResponse generateImages(
      String model, String prompt, GenerateImagesConfig config) {

    GenerateImagesResponse apiResponse = privateGenerateImages(model, prompt, config);

    SafetyAttributes positivePromptSafetyAttributes = null;
    List<GeneratedImage> generatedImages = new ArrayList<>();

    if (apiResponse.generatedImages().isPresent()) {
      for (GeneratedImage generatedImage : apiResponse.generatedImages().get()) {
        if (generatedImage.safetyAttributes().isPresent()
            && generatedImage.safetyAttributes().get().contentType().isPresent()
            && generatedImage
                .safetyAttributes()
                .get()
                .contentType()
                .get()
                .equals("Positive Prompt")) {
          positivePromptSafetyAttributes = generatedImage.safetyAttributes().get();
        } else {
          generatedImages.add(generatedImage);
        }
      }
    }

    GenerateImagesResponse.Builder builder =
        GenerateImagesResponse.builder().generatedImages(generatedImages);

    if (positivePromptSafetyAttributes != null) {
      builder = builder.positivePromptSafetyAttributes(positivePromptSafetyAttributes);
    }

    GenerateImagesResponse response = builder.build();
    return response;
  }

  /**
   * Edits an image given a GenAI model, a prompt, and a list of reference images.
   *
   * @param model the name of the GenAI model to use for editing capabilities
   * @param prompt the prompt to edit the image
   * @param referenceImages a {@link List<com.google.genai.types.ReferenceImage>} to send to use for
   *     editing. The 5 types of reference images are: {@link
   *     com.google.genai.types.RawReferenceImage}, {@link
   *     com.google.genai.types.MaskReferenceImage}, {@link
   *     com.google.genai.types.ControlReferenceImage}, {@link
   *     com.google.genai.types.StyleReferenceImage}, {@link
   *     com.google.genai.types.SubjectReferenceImage},
   * @param config a {@link com.google.genai.types.EditImageConfig} instance that specifies the
   *     optional configurations
   * @return a {@link com.google.genai.types.EditImageResponse} instance that contains the upscaled
   *     image.
   */
  public EditImageResponse editImage(
      String model, String prompt, List<ReferenceImage> referenceImages, EditImageConfig config) {

    List<ReferenceImageAPI> referenceImagesAPI = new ArrayList<>();
    for (ReferenceImage referenceImage : referenceImages) {
      referenceImagesAPI.add(referenceImage.toReferenceImageAPI());
    }

    return privateEditImage(model, prompt, referenceImagesAPI, config);
  }

  /**
   * Upscales an image given a GenAI model and an image and an upscale factor.
   *
   * @param model the name of the GenAI model to use for upscaling
   * @param image a {@link com.google.genai.types.Image} to send to the generative model
   * @param upscaleFactor the factor to upscale the image
   * @param config a {@link com.google.genai.types.UpscaleImageConfig} instance that specifies the
   *     optional configurations
   * @return a {@link com.google.genai.types.UpscaleImageResponse} instance that contains the
   *     upscaled image.
   */
  public UpscaleImageResponse upscaleImage(
      String model, Image image, String upscaleFactor, UpscaleImageConfig config) {

    UpscaleImageAPIConfig.Builder builder = UpscaleImageAPIConfig.builder();
    if (config != null) {
      if (config.outputMimeType().isPresent()) {
        builder = builder.outputMimeType(config.outputMimeType().get());
      }
      if (config.outputCompressionQuality().isPresent()) {
        builder = builder.outputCompressionQuality(config.outputCompressionQuality().get());
      }
      if (config.includeRaiReason().isPresent()) {
        builder = builder.includeRaiReason(config.includeRaiReason().get());
      }
    }

    builder = builder.mode("upscale");
    builder = builder.numberOfImages(1);

    UpscaleImageAPIConfig apiConfig = builder.build();

    return privateUpscaleImage(model, image, upscaleFactor, apiConfig);
  }

  /**
   * Embeds content given a GenAI model and a text string.
   *
   * @param model the name of the GenAI model to use for embedding
   * @param text the text string to send to the embedding model
   * @return a {@link com.google.genai.types.EmbedContentResponse} instance that contains the
   *     embedding.
   */
  public EmbedContentResponse embedContent(String model, String text, EmbedContentConfig config) {
    return embedContent(model, ImmutableList.of(text), config);
  }

  /**
   * Embeds content given a GenAI model and a list of text strings.
   *
   * @param model the name of the GenAI model to use for embedding
   * @param texts the list of text strings to send to the embedding model
   * @return a {@link com.google.genai.types.EmbedContentResponse} instance that contains the
   *     embedding.
   */
  public EmbedContentResponse embedContent(
      String model, List<String> texts, EmbedContentConfig config) {
    List<Content> contents = new ArrayList<>();
    for (String text : texts) {
      contents.add(Content.fromParts(Part.fromText(text)));
    }
    return privateEmbedContent(model, contents, config);
  }
}
