package com.course.Course.job;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@Getter
@Setter
public class Job {

    private long id;

    private String title;

    private String description;

    private String maxSalary;

    private String minSalary;

    private String location;
}
