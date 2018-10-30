package com.example.orderingsystem.utils;

import com.example.orderingsystem.VO.ResultVO;

public class ResultVOUtil {

	public static ResultVO success(Object object){
		ResultVO resultVO = new ResultVO();
		resultVO.setCode(200);
		resultVO.setMessage("成功");
		resultVO.setData(object);
		return resultVO;
	}

	public static ResultVO success(){
		return success(null);
	}
}
