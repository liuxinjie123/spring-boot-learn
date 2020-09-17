package com.dream.demo.leafid.id;

import com.dream.demo.leafid.Result;
import com.dream.demo.leafid.Status;

public class ZeroIDGen implements IDGen {
	
    @Override
    public Result get(String key) {
        return new Result(0, Status.SUCCESS);
    }

    @Override
    public boolean init() {
        return true;
    }
}
