/*
 * Copyright (c) 2011-2018, Meituan Dianping. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dianping.cat.message;

/**
 * <p>
 * <code>Trace</code> is used to log anything for trace message info happens at a specific time. Such as an debug or info message.
 * </p>
 * 
 * <p>
 * All CAT message will be constructed as a message tree and send to back-end for further analysis, and for monitoring.
 * Only <code>Transaction</code> can be a tree node, all other message will be the tree leaf.　The transaction without
 * other messages nested is an atomic transaction.
 * </p>
 * 
 * @author Frankie Wu
 */
public interface Trace extends Message {

}
