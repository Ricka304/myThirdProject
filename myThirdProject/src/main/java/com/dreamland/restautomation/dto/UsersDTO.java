package com.dreamland.restautomation.dto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDTO {

private Integer page;
private Integer perPage;
private Integer total;
private Integer totalPages;
private List<DataDTO> data = null;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Integer getPage() {
return page;
}

public void setPage(Integer page) {
this.page = page;
}

public Integer getPerPage() {
return perPage;
}

public void setPerPage(Integer perPage) {
this.perPage = perPage;
}

public Integer getTotal() {
return total;
}

public void setTotal(Integer total) {
this.total = total;
}

public Integer getTotalPages() {
return totalPages;
}

public void setTotalPages(Integer totalPages) {
this.totalPages = totalPages;
}

public List<DataDTO> getData() {
return data;
}

public void setData(List<DataDTO> data) {
this.data = data;
}


public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
