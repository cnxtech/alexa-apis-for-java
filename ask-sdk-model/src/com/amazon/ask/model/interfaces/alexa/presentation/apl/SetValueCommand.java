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
 * Change a dynamic property of a component without redrawing the screen.
 */

@JsonDeserialize(builder = SetValueCommand.Builder.class)
public final class SetValueCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command {

  @JsonProperty("componentId")
  private String componentId = null;

  @JsonProperty("property")
  private String property = null;

  @JsonProperty("value")
  private String value = null;

  public static Builder builder() {
    return new Builder();
  }

  private SetValueCommand(Builder builder) {
    String discriminatorValue = "SetValue";

    this.type = discriminatorValue;
    this.delay = builder.delay;
    this.description = builder.description;
    this.when = builder.when;
    this.componentId = builder.componentId;
    this.property = builder.property;
    this.value = builder.value;
  }

  /**
    * The id of the component whose value to set.
  * @return componentId
  **/
  public String getComponentId() {
    return componentId;
  }

  /**
    * The name of the property to set.
  * @return property
  **/
  public String getProperty() {
    return property;
  }

  /**
    * The property value to set.
  * @return value
  **/
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetValueCommand interfacesAlexaPresentationAplSetValueCommand = (SetValueCommand) o;
    return Objects.equals(this.componentId, interfacesAlexaPresentationAplSetValueCommand.componentId) &&
        Objects.equals(this.property, interfacesAlexaPresentationAplSetValueCommand.property) &&
        Objects.equals(this.value, interfacesAlexaPresentationAplSetValueCommand.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentId, property, value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetValueCommand {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    private String componentId;
    private String property;
    private String value;

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
      

    @JsonProperty("componentId")
    public Builder withComponentId(String componentId) {
      this.componentId = componentId;
      return this;
    }
      

    @JsonProperty("property")
    public Builder withProperty(String property) {
      this.property = property;
      return this;
    }
      

    @JsonProperty("value")
    public Builder withValue(String value) {
      this.value = value;
      return this;
    }
      

    public SetValueCommand build() {
      return new SetValueCommand(this);
    }
  }
}

