package com.example.vindecoder.dto;

public class VinDecodeResult {
    private String groupName;
    private String variable;
    private String value;

    private String patternId;
    private String vinId;
    private String vinPattern;
    private String variableId;
    private String variableCode;

    // Getters and Setters
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPatternId() {
        return patternId;
    }

    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    public String getVinId() {
        return vinId;
    }

    public void setVinId(String vinId) {
        this.vinId = vinId;
    }

    public String getVinPattern() {
        return vinPattern;
    }

    public void setVinPattern(String vinPattern) {
        this.vinPattern = vinPattern;
    }

    public String getVariableId() {
        return variableId;
    }

    public void setVariableId(String variableId) {
        this.variableId = variableId;
    }

    public String getVariableCode() {
        return variableCode;
    }

    public void setVariableCode(String variableCode) {
        this.variableCode = variableCode;
    }
}
