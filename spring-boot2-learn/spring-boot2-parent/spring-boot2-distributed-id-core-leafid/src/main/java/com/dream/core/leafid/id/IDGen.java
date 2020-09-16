package com.dream.core.leafid.id;

import com.dream.core.leafid.Result;

public interface IDGen {
    Result get(String key);

    boolean init();

}
