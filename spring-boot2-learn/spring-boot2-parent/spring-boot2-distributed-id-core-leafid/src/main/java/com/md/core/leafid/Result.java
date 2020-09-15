package com.md.core.leafid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Result {
    private long id;
    private Status status;

    public Result(long id, Status status) {
        this.id = id;
        this.status = status;
    }

}
