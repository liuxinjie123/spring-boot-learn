package com.dream.demo.leafid.id;

import com.dream.demo.leafid.Result;

public interface IDGen {
    Result get(String key);

    boolean init();

}
