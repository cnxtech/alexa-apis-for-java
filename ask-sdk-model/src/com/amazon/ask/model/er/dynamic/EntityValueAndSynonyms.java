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


package com.amazon.ask.model.er.dynamic;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A container object with value and synomyms for the entity
 */

@JsonDeserialize(builder = EntityValueAndSynonyms.Builder.class)
public final class EntityValueAndSynonyms{

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("synonyms")
  private List<String> synonyms = new ArrayList<String>();

  public static Builder builder() {
    return new Builder();
  }

  private EntityValueAndSynonyms(Builder builder) {
    this.value = builder.value;
    this.synonyms = builder.synonyms;
  }

  /**
    * The entity value
  * @return value
  **/
  public String getValue() {
    return value;
  }

  /**
    * An array of synonyms for the entity
  * @return synonyms
  **/
  public List<String> getSynonyms() {
    return synonyms;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityValueAndSynonyms erDynamicEntityValueAndSynonyms = (EntityValueAndSynonyms) o;
    return Objects.equals(this.value, erDynamicEntityValueAndSynonyms.value) &&
        Objects.equals(this.synonyms, erDynamicEntityValueAndSynonyms.synonyms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, synonyms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityValueAndSynonyms {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    synonyms: ").append(toIndentedString(synonyms)).append("\n");
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
    private String value;
    private List<String> synonyms;

    private Builder() { }

    @JsonProperty("value")
    public Builder withValue(String value) {
      this.value = value;
      return this;
    }
      

    @JsonProperty("synonyms")
    public Builder withSynonyms(List<String> synonyms) {
      this.synonyms = synonyms;
      return this;
    }
      
    public Builder addSynonymsItem(String synonymsItem) {
      if (this.synonyms == null) {
        this.synonyms = new ArrayList<String>();
      }
      this.synonyms.add(synonymsItem);
      return this;
    }

    public EntityValueAndSynonyms build() {
      return new EntityValueAndSynonyms(this);
    }
  }
}

