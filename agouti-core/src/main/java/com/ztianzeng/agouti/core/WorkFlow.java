/*
 * Copyright 2018-2019 zTianzeng Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ztianzeng.agouti.core;


import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * 任务编排流程
 *
 * @author zhaotianzeng
 * @version V1.0
 * @date 2019-01-28 17:52
 */
@Getter
@AllArgsConstructor
public class WorkFlow {

    private String name;

    private String description;

    /**
     * 定义好最后输出的数据模型
     */
    private JSONObject outputs;

    private List<Task> tasks;

}