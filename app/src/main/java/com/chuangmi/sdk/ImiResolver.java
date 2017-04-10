package com.chuangmi.sdk;

import org.json.JSONException;

/**
 * Created by SHD on 2017/3/21.
 */

public interface ImiResolver<T> {

  public T resolver(String result) throws JSONException;


}
