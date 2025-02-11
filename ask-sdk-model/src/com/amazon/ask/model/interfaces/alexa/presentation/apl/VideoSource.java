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
 * The source property holds the video clip or sequence of video clips to play.
 */

@JsonDeserialize(builder = VideoSource.Builder.class)
public final class VideoSource{

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("repeatCount")
  private Integer repeatCount = null;

  @JsonProperty("offset")
  private Integer offset = null;

  public static Builder builder() {
    return new Builder();
  }

  private VideoSource(Builder builder) {
    this.description = builder.description;
    this.duration = builder.duration;
    this.url = builder.url;
    this.repeatCount = builder.repeatCount;
    this.offset = builder.offset;
  }

  /**
    * Optional description of this source material
  * @return description
  **/
  public String getDescription() {
    return description;
  }

  /**
    * Duration of time to play. If not set, defaults to the entire stream. Expressed in milliseconds.
  * @return duration
  **/
  public Integer getDuration() {
    return duration;
  }

  /**
    * Media source material
  * @return url
  **/
  public String getUrl() {
    return url;
  }

  /**
    * Number of times to loop the video. Defaults to 0.
  * @return repeatCount
  **/
  public Integer getRepeatCount() {
    return repeatCount;
  }

  /**
    * Offset to start playing at in the stream (defaults to 0).
  * @return offset
  **/
  public Integer getOffset() {
    return offset;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSource interfacesAlexaPresentationAplVideoSource = (VideoSource) o;
    return Objects.equals(this.description, interfacesAlexaPresentationAplVideoSource.description) &&
        Objects.equals(this.duration, interfacesAlexaPresentationAplVideoSource.duration) &&
        Objects.equals(this.url, interfacesAlexaPresentationAplVideoSource.url) &&
        Objects.equals(this.repeatCount, interfacesAlexaPresentationAplVideoSource.repeatCount) &&
        Objects.equals(this.offset, interfacesAlexaPresentationAplVideoSource.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, duration, url, repeatCount, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
    private String description;
    private Integer duration;
    private String url;
    private Integer repeatCount;
    private Integer offset;

    private Builder() { }

    @JsonProperty("description")
    public Builder withDescription(String description) {
      this.description = description;
      return this;
    }
      

    @JsonProperty("duration")
    public Builder withDuration(Integer duration) {
      this.duration = duration;
      return this;
    }
      

    @JsonProperty("url")
    public Builder withUrl(String url) {
      this.url = url;
      return this;
    }
      

    @JsonProperty("repeatCount")
    public Builder withRepeatCount(Integer repeatCount) {
      this.repeatCount = repeatCount;
      return this;
    }
      

    @JsonProperty("offset")
    public Builder withOffset(Integer offset) {
      this.offset = offset;
      return this;
    }
      

    public VideoSource build() {
      return new VideoSource(this);
    }
  }
}

