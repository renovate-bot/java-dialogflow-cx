/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/page.proto

package com.google.cloud.dialogflow.cx.v3;

public interface UpdatePageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.UpdatePageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The page to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the page field is set.
   */
  boolean hasPage();
  /**
   *
   *
   * <pre>
   * Required. The page to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The page.
   */
  com.google.cloud.dialogflow.cx.v3.Page getPage();
  /**
   *
   *
   * <pre>
   * Required. The page to update.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Page page = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.PageOrBuilder getPageOrBuilder();

  /**
   *
   *
   * <pre>
   * The language of the following fields in `page`:
   * *  `Page.entry_fulfillment.messages`
   * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
   * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
   * *  `Page.transition_routes.trigger_fulfillment.messages`
   * *
   * `Page.transition_route_groups.transition_routes.trigger_fulfillment.messages`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language of the following fields in `page`:
   * *  `Page.entry_fulfillment.messages`
   * *  `Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages`
   * *  `Page.form.parameters.fill_behavior.reprompt_event_handlers.messages`
   * *  `Page.transition_routes.trigger_fulfillment.messages`
   * *
   * `Page.transition_route_groups.transition_routes.trigger_fulfillment.messages`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The mask to control which fields get updated. If the mask is not present,
   * all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}