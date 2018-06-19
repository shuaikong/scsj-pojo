package com.scsj.pojo.enumeration;

/**
 * Created by KongShuai on 2017/6/16.
 */
public enum ClientTypeEnum {
  web(1, "网页"),
  ios(2, "苹果手机"),
  android(3, "安卓手机"),
  wap(4, "wap"),
  miniApp(5, "mp");
  int code;
  String name;

  ClientTypeEnum(int code, String name) {
    this.code = code;
    this.name = name;
  }
}
