/*
 * Copyright (C) 2016-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package docs.services;

import com.lightbend.lagom.javadsl.api.*;
import akka.NotUsed;
import static java.util.concurrent.CompletableFuture.completedFuture;

public class EchoServiceImpl implements EchoService {

  public ServiceCall<String, String> echo() {
    return input -> completedFuture(input);
  }
}
