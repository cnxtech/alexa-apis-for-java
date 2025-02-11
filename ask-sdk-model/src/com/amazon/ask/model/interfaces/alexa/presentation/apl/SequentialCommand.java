/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A sequential command executes a series of commands in order. The sequential command executes the command list in order, waiting for the previous command to finish before executing the next. The sequential command is finished when all of its child commands have finished. When the Sequential command is terminated early, the currently executing command is terminated and no further commands are executed.
 */

@JsonDeserialize(builder = SequentialCommand.Builder.class)
public final class SequentialCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("commands")
  private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();

  @JsonProperty("repeatCount")
  private Integer repeatCount = null;

  public static Builder builder() {
    return new Builder();
  }

  private SequentialCommand(Builder builder) {
    String discriminatorValue = "Sequential";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.commands = builder.commands;
    this.repeatCount = builder.repeatCount;
  }

  /**
    * An array of commands to execute. The commands execute in order; each command must finish before the next can begin. Please note that the delay of sequential command and the delay of the first command in the sequence are additive.
  * @return commands
  **/
  public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> getCommands() {
    return commands;
  }

  /**
    * The number of times to repeat this series of commands. Defaults to 0. Negative values will be ignored. Note that the delay assigned to overall sequential command only applies the first time. For example, in the sample sequential command below the first SendEvent fires at 3000 milliseconds, the second at 5000, the first SendEvent fires again at 7000 milliseconds, and so forth. {\"type\": \"Sequential\",\"delay\": 1000,\"repeatCount\": 2,\"commands\": [{ \"type\": \"SendEvent\",\"delay\": 2000},{\"type\": \"SendEvent\",\"delay\": 2000}]}
  * @return repeatCount
  **/
  public Integer getRepeatCount() {
    return repeatCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SequentialCommand interfacesAlexaPresentationAplSequentialCommand = (SequentialCommand) o;
    return Objects.equals(this.commands, interfacesAlexaPresentationAplSequentialCommand.commands) &&
        Objects.equals(this.repeatCount, interfacesAlexaPresentationAplSequentialCommand.repeatCount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commands, repeatCount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SequentialCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {
    private Integer delay;
    private String description;
    private Boolean when;
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands;
    private Integer repeatCount;

    private Builder() { }
      

    @JsonProperty("delay")
    public Builder withDelay(Integer delay) {
      this.delay = delay;
      return this;
    }
      

    @JsonProperty("description")
    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }
      

    @JsonProperty("when")
    public Builder withWhen(Boolean when) {
      this.when = when;
      return this;
    }
      

    @JsonProperty("commands")
    public Builder withCommands(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> commands) {
      this.commands = commands;
      return this;
    }
      
    public Builder addCommandsItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.Command commandsItem) {
      if (this.commands == null) {
        this.commands = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();
      }
      this.commands.add(commandsItem);
      return this;
    }

    @JsonProperty("repeatCount")
    public Builder withRepeatCount(Integer repeatCount) {
      this.repeatCount = repeatCount;
      return this;
    }
      

    public SequentialCommand build() {
      return new SequentialCommand(this);
    }
  }
}

