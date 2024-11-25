package com.green.greengramver1.feed.model;

import com.green.greengramver1.common.model.Paging;


public class FeedGetReq extends Paging {
    public FeedGetReq(Integer page, Integer size) {
        super(page,size);
    }
}
