/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.dev.debug.impl;

import org.camunda.bpm.dev.debug.DebugSessionFactory;
import org.camunda.bpm.engine.impl.interceptor.CommandContext;
import org.camunda.bpm.engine.impl.interceptor.CommandContextFactory;

/**
 * @author Daniel Meyer
 *
 */
public class DebugCommandContextFactory extends CommandContextFactory {

  public CommandContext createCommandContext() {
    return new DebugCommandContext(processEngineConfiguration, (DebugSessionFactoryImpl) DebugSessionFactory.getInstance());
  }

}
