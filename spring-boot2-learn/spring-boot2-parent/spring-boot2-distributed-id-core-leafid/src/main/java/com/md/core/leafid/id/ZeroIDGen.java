package com.md.core.leafid.id;

import com.md.core.leafid.Result;
import com.md.core.leafid.Status;
import com.md.core.leafid.id.IDGen;

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
