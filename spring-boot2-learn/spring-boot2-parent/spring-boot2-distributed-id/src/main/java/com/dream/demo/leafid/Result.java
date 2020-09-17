package com.dream.demo.leafid;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Result implements Serializable {
    private static final long serialVersionUID = 8732529600721354719L;

    private long id;
    private Status status;

    public Result(long id, Status status) {
        this.id = id;
        this.status = status;
    }

}
