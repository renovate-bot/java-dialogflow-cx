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
package com.google.cloud.dialogflow.cx.v3;

import com.google.api.core.BetaApi;
import com.google.cloud.dialogflow.cx.v3.TransitionRouteGroupsGrpc.TransitionRouteGroupsImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockTransitionRouteGroupsImpl extends TransitionRouteGroupsImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockTransitionRouteGroupsImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void listTransitionRouteGroups(
      ListTransitionRouteGroupsRequest request,
      StreamObserver<ListTransitionRouteGroupsResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListTransitionRouteGroupsResponse) {
      requests.add(request);
      responseObserver.onNext((ListTransitionRouteGroupsResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getTransitionRouteGroup(
      GetTransitionRouteGroupRequest request,
      StreamObserver<TransitionRouteGroup> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TransitionRouteGroup) {
      requests.add(request);
      responseObserver.onNext((TransitionRouteGroup) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createTransitionRouteGroup(
      CreateTransitionRouteGroupRequest request,
      StreamObserver<TransitionRouteGroup> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TransitionRouteGroup) {
      requests.add(request);
      responseObserver.onNext((TransitionRouteGroup) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateTransitionRouteGroup(
      UpdateTransitionRouteGroupRequest request,
      StreamObserver<TransitionRouteGroup> responseObserver) {
    Object response = responses.remove();
    if (response instanceof TransitionRouteGroup) {
      requests.add(request);
      responseObserver.onNext((TransitionRouteGroup) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteTransitionRouteGroup(
      DeleteTransitionRouteGroupRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}