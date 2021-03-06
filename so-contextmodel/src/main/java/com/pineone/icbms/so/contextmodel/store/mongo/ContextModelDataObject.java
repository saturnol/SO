package com.pineone.icbms.so.contextmodel.store.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by melvin on 2016. 8. 22..
 * NOTE: 내부 저장소 에서 사용할 ContextModel Data
 */

@Document(collection = "context_model")
public class ContextModelDataObject {

    private String id;
    private String name;
    private List<String> domainIdList;
    private List<String> contextInformationIdList;
    private String contextType;
    private String createTime;
    private String modifiedTime;
    private String occTime;

    public ContextModelDataObject() {
    }

    public ContextModelDataObject(String id, String name, List<String> domainIdList, List<String> contextInformationIdList, String contextType) {
        this.id = id;
        this.name = name;
        this.domainIdList = domainIdList;
        this.contextInformationIdList = contextInformationIdList;
        this.contextType = contextType;
    }

    public ContextModelDataObject(String id, String name, List<String> domainIdList, List<String> contextInformationIdList, String contextType, String createTime, String modifiedTime) {
        this.id = id;
        this.name = name;
        this.domainIdList = domainIdList;
        this.contextInformationIdList = contextInformationIdList;
        this.contextType = contextType;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<String> getDomainIdList() {
        return domainIdList;
    }

    public void setDomainIdList(List<String> domainIdList) {
        this.domainIdList = domainIdList;
    }

    public List<String> getContextInformationIdList() {
        return contextInformationIdList;
    }

    public void setContextInformationIdList(List<String> contextInformationIdList) {
        this.contextInformationIdList = contextInformationIdList;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getOccTime() {
        return occTime;
    }

    public void setOccTime(String occTime) {
        this.occTime = occTime;
    }
}
