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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Scroll a ScrollView or Sequence forward or backward by a number of pages. The Scroll command has the following properties in addition to the regular command properties.
 */

@JsonDeserialize(builder = ScrollCommand.Builder.class)
public final class ScrollCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("distance")
  private Integer distance = null;

  @JsonProperty("componentId")
  private String componentId = null;

  public static Builder builder() {
    return new Builder();
  }

  private ScrollCommand(Builder builder) {
    String discriminatorValue = "Scroll";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.distance = builder.distance;
    this.componentId = builder.componentId;
  }

  /**
    * The number of pages to scroll. Defaults to 1.
  * @return distance
  **/
  public Integer getDistance() {
    return distance;
  }

  /**
    * The id of the component.
  * @return componentId
  **/
  public String getComponentId() {
    return componentId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollCommand interfacesAlexaPresentationAplScrollCommand = (ScrollCommand) o;
    return Objects.equals(this.distance, interfacesAlexaPresentationAplScrollCommand.distance) &&
        Objects.equals(this.componentId, interfacesAlexaPresentationAplScrollCommand.componentId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, componentId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
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
    private Integer distance;
    private String componentId;

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
      

    @JsonProperty("distance")
    public Builder withDistance(Integer distance) {
      this.distance = distance;
      return this;
    }
      

    @JsonProperty("componentId")
    public Builder withComponentId(String componentId) {
      this.componentId = componentId;
      return this;
    }
      

    public ScrollCommand build() {
      return new ScrollCommand(this);
    }
  }
}

