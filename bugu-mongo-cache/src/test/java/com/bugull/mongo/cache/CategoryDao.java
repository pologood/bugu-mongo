/*
 * Copyright (c) www.bugull.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugull.mongo.cache;

import com.bugull.mongo.BuguQuery;
import com.bugull.mongo.utils.SortUtil;

/**
 *
 * @author Frank Wen(xbwen@hotmail.com)
 */
public class CategoryDao extends CacheableDao<Category> {
    
    public CategoryDao() {
        super(Category.class);
        //comment the next line, will cache all data
        BuguQuery q = this.query().is("valid", Boolean.TRUE).sort(SortUtil.asc("order")).pageNumber(1).pageSize(50);
        this.setCacheQuery(q);
    }
    
}
