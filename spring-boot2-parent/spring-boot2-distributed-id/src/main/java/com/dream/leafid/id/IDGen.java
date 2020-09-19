package com.dream.leafid.id;

import com.dream.leafid.Result;

public interface IDGen {
    Result get(String key);

    boolean init();

}
