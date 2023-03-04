
package com.github.codergate.dto.push;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "tree_id",
    "distinct",
    "message",
    "timestamp",
    "url",
    "author",
    "committer",
    "added",
    "removed",
    "modified"
})
@Generated("jsonschema2pojo")
public class CommitDTO implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("tree_id")
    private String treeId;
    @JsonProperty("distinct")
    private Boolean distinct;
    @JsonProperty("message")
    private String message;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("url")
    private String url;
    @JsonProperty("author")
    private AuthorDTO authorDTO;
    @JsonProperty("committer")
    private CommitterDTO committerDTO;
    @JsonProperty("added")
    private List<Object> added;
    @JsonProperty("removed")
    private List<Object> removed;
    @JsonProperty("modified")
    private List<String> modified;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
    private final static long serialVersionUID = -1674798038151900187L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CommitDTO() {
    }

    /**
     * 
     * @param treeId
     * @param committerDTO
     * @param removed
     * @param added
     * @param authorDTO
     * @param distinct
     * @param modified
     * @param id
     * @param message
     * @param url
     * @param timestamp
     */
    public CommitDTO(String id, String treeId, Boolean distinct, String message, String timestamp, String url, AuthorDTO authorDTO, CommitterDTO committerDTO, List<Object> added, List<Object> removed, List<String> modified) {
        super();
        this.id = id;
        this.treeId = treeId;
        this.distinct = distinct;
        this.message = message;
        this.timestamp = timestamp;
        this.url = url;
        this.authorDTO = authorDTO;
        this.committerDTO = committerDTO;
        this.added = added;
        this.removed = removed;
        this.modified = modified;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("tree_id")
    public String getTreeId() {
        return treeId;
    }

    @JsonProperty("tree_id")
    public void setTreeId(String treeId) {
        this.treeId = treeId;
    }

    @JsonProperty("distinct")
    public Boolean getDistinct() {
        return distinct;
    }

    @JsonProperty("distinct")
    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("author")
    public AuthorDTO getAuthor() {
        return authorDTO;
    }

    @JsonProperty("author")
    public void setAuthor(AuthorDTO authorDTO) {
        this.authorDTO = authorDTO;
    }

    @JsonProperty("committer")
    public CommitterDTO getCommitter() {
        return committerDTO;
    }

    @JsonProperty("committer")
    public void setCommitter(CommitterDTO committerDTO) {
        this.committerDTO = committerDTO;
    }

    @JsonProperty("added")
    public List<Object> getAdded() {
        return added;
    }

    @JsonProperty("added")
    public void setAdded(List<Object> added) {
        this.added = added;
    }

    @JsonProperty("removed")
    public List<Object> getRemoved() {
        return removed;
    }

    @JsonProperty("removed")
    public void setRemoved(List<Object> removed) {
        this.removed = removed;
    }

    @JsonProperty("modified")
    public List<String> getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(List<String> modified) {
        this.modified = modified;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CommitDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("treeId");
        sb.append('=');
        sb.append(((this.treeId == null)?"<null>":this.treeId));
        sb.append(',');
        sb.append("distinct");
        sb.append('=');
        sb.append(((this.distinct == null)?"<null>":this.distinct));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.authorDTO == null)?"<null>":this.authorDTO));
        sb.append(',');
        sb.append("committer");
        sb.append('=');
        sb.append(((this.committerDTO == null)?"<null>":this.committerDTO));
        sb.append(',');
        sb.append("added");
        sb.append('=');
        sb.append(((this.added == null)?"<null>":this.added));
        sb.append(',');
        sb.append("removed");
        sb.append('=');
        sb.append(((this.removed == null)?"<null>":this.removed));
        sb.append(',');
        sb.append("modified");
        sb.append('=');
        sb.append(((this.modified == null)?"<null>":this.modified));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.added == null)? 0 :this.added.hashCode()));
        result = ((result* 31)+((this.authorDTO == null)? 0 :this.authorDTO.hashCode()));
        result = ((result* 31)+((this.distinct == null)? 0 :this.distinct.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.treeId == null)? 0 :this.treeId.hashCode()));
        result = ((result* 31)+((this.committerDTO == null)? 0 :this.committerDTO.hashCode()));
        result = ((result* 31)+((this.removed == null)? 0 :this.removed.hashCode()));
        result = ((result* 31)+((this.modified == null)? 0 :this.modified.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommitDTO) == false) {
            return false;
        }
        CommitDTO rhs = ((CommitDTO) other);
        return (((((((((((((this.added == rhs.added)||((this.added!= null)&&this.added.equals(rhs.added)))&&((this.authorDTO == rhs.authorDTO)||((this.authorDTO != null)&&this.authorDTO.equals(rhs.authorDTO))))&&((this.distinct == rhs.distinct)||((this.distinct!= null)&&this.distinct.equals(rhs.distinct))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.treeId == rhs.treeId)||((this.treeId!= null)&&this.treeId.equals(rhs.treeId))))&&((this.committerDTO == rhs.committerDTO)||((this.committerDTO != null)&&this.committerDTO.equals(rhs.committerDTO))))&&((this.removed == rhs.removed)||((this.removed!= null)&&this.removed.equals(rhs.removed))))&&((this.modified == rhs.modified)||((this.modified!= null)&&this.modified.equals(rhs.modified))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
