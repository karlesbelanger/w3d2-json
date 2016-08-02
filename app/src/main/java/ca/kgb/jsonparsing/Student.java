
package ca.kgb.jsonparsing;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private Integer age;
    private Double grade;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The age
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @param age
     * The age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @return
     * The grade
     */
    public Double getGrade() {
        return grade;
    }

    /**
     *
     * @param grade
     * The grade
     */
    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}