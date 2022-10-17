package com.hwans.trendapiserver.controller;

import com.hwans.trendapiserver.common.Constants;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "트렌드")
@RequestMapping(value = Constants.API_PREFIX)
@RequiredArgsConstructor
public class TrendController {

}
