package com.github.alexanderwe.bananaj.model.list.segment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.alexanderwe.bananaj.model.Link;

import java.util.List;

public class Segments {

    @JsonProperty
    List<Segment> segments;
    @JsonProperty
    String list_id;
    @JsonProperty
    int total_items;
    @JsonProperty
    List<Link> _links;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> members) {
        this.segments = members;
    }

    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }
}
