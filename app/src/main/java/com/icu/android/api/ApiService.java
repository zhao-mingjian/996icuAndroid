package com.icu.android.api;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

public interface ApiService {

    @POST("test")
    Observable<ResponseBody> applyLoan(@Body RequestBody body);

}
