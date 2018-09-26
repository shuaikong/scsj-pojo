package com.scsj.pojo.vo;

import java.io.Serializable;

import com.scsj.pojo.enumeration.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by KongShuai on 2017/5/15.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseVo<T> implements Serializable {

  // 成功标记
  private boolean success;
  // 提示信息
  private String msg;
  // 状态码
  private int statusCode;
  // 返回的具体数据
  private T data;

  private String b;

  public static ResponseVo success() {
    return ResponseVo.builder()
        .success(true)
        .statusCode(CodeEnum.success.getCode())
        .msg(CodeEnum.success.getMsg())
        .build();
  }

  public static ResponseVo error() {
    return ResponseVo.builder()
        .success(false)
        .statusCode(CodeEnum.unknown_error.getCode())
        .msg(CodeEnum.unknown_error.getMsg())
        .build();
  }

  public static ResponseVo success(Boolean success) {
    if(success){
      return ResponseVo.success();
    }else{
      return ResponseVo.error();
    }
  }

  public static ResponseVo success(Object data) {
    return ResponseVo.builder()
        .success(true)
        .statusCode(CodeEnum.success.getCode())
        .msg(CodeEnum.success.getMsg())
        .data(data)
        .build();
  }

  public static ResponseVo error(CodeEnum codeEnum) {
    return ResponseVo.builder()
        .success(false)
        .statusCode(codeEnum.getCode())
        .msg(codeEnum.getMsg())
        .build();
  }

  public static ResponseVo error(CodeEnum codeEnum, String msg) {
    return ResponseVo.builder()
        .success(false)
        .statusCode(codeEnum.getCode())
        .msg(msg)
        .build();
  }

}
