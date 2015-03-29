package com.myweather.app.util;

public interface HttpcallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
